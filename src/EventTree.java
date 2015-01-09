import java.util.*;

public class EventTree {

    //fields
    //outside acces to inventory and current pointers.
    private EventNode overallRoot;
    private EventNode lastCheckpoint;
    public EventNode current;
    public static int numCheckpoints;
    private ArrayList<String> savedInventory;

    //Loads a full game
    public void load(Scanner in) {
        EventNode[] allRoots;
        String line = "";
        numCheckpoints = 0;
        int checkCount;

        //Determines the number of checkpoints in the file, then creates an array
        //to hold the overallRoot of each subTree
        while (in.hasNextLine()) {
            line = in.nextLine();
            if (line.contains("Number of Checkpoints:")) {
                break;
            }
        }

        //Reads number of checkpoints in the game
        String[] divide = line.split("[:]");
        numCheckpoints = Integer.parseInt(divide[1].trim());
        allRoots = new EventNode[numCheckpoints];
        checkCount = numCheckpoints - 1;

        //Loads in a subtree for each checkpoint
        while (in.hasNextLine()) {
            line = in.nextLine();
            if (line.contains("Checkpoint")) {

                EventSubTree temp = new EventSubTree();
                temp.load(in, allRoots);
                //Store overallRoot for each tree
                allRoots[checkCount] = temp.getOverallRoot();
                temp.getOverallRoot().setCheckpoint(true);
                //If incorrect amount of lines, returns an error
                if (!in.nextLine().contains("//")) {
                    System.out.println("Error reading file: Incorrect number"
                            + " of event lines (too many)");
                    return;
                }
                checkCount--;
            }
        }
        //After each subtree has been fully loaded, reassings return nodes.
        EventSubTree.reassignReturnNodes(allRoots);
        //Set overallRoot to the first checkpoint
        overallRoot = allRoots[0];
    }

    //raturns string of item prompt
    private String addItemPrompt(String line) {
        return line.substring(1);
    }

    //returns items in event
    private ArrayList<String> addItem(String line) {
        ArrayList<String> item = new ArrayList<String>();

        //Separates all item types and puts them in an array
        String[] allItems = line.split("[,]");

        //Put every item type into the event item list
        for (String thisItem : allItems) {
            //splits item with the amount
            String[] divide = thisItem.split("[#]");

            //turns amount into int
            int itemNumber = Integer.parseInt(divide[1].trim());
//        Map<String, Integer> item = new TreeMap<String, Integer>();

            //for however the amount, put that many items into the list
            for (int i = 0; i < itemNumber; i++) {
                item.add(divide[0].trim());
            }
        }

        //return completed list
        return item;
    }

    public void playHelper(javax.swing.JButton jButton1,
            javax.swing.JButton jButton2, javax.swing.JButton jButton3,
            javax.swing.JLabel jLabel2, javax.swing.JLabel jLabel3,
            javax.swing.JLabel jLabel4, javax.swing.JLabel jLabel5,
            javax.swing.JLabel picture, javax.swing.JLabel itemLabel,
            javax.swing.JButton pickUpButton, ArrayList<String> inventory,
            javax.swing.JButton tryAgainButton,javax.swing.JButton 
                    checkpointButton, javax.swing.JLabel jLabel1) {

        //format after every choice
        setPlay(jButton1, jButton2, jButton3, jLabel2, jLabel3, jLabel4,
                jLabel5, itemLabel, pickUpButton, checkpointButton, jLabel1);

        //set text
        jLabel2.setText("<html>" + current.getExposition() + "</html>");

        //if game is finished, end game
        if (current.left == null && current.center == null
                && current.right == null) {

            clearPanel(jButton1, jButton2, jButton3, jLabel2, jLabel3,
                    jLabel4, jLabel5, itemLabel, checkpointButton);
            if (current.isFinalEnding()) {
                jLabel3.setText("Congratulations, You have completed the game!");
            }
            else {
                jLabel3.setText("Game over. Please try again or continue "
                    + "from previous checkpoint.");
            }
            checkpointButton.setEnabled(true);
            picture.setVisible(true);
            //try again?
            tryAgainButton.setEnabled(true);
        } //Give choices for next events
        else {
            //Sets checkpoint
            if (current.getCheckpoint()) {
                lastCheckpoint = current;
                savedInventory = new ArrayList<String>(inventory);
                checkpointButton.setEnabled(false);
            } else {
                checkpointButton.setEnabled(true);
            }
            //IF game is not over, must be at least one choice;
            //checks if any options need items and disables buttons accordingly
            checkForRightItem(pickUpButton, jButton1, jButton2, jButton3,
                    jLabel3, jLabel4, jLabel5, inventory);

            //Sets pick up button to visible if there is an item on the ground
            if (current.hasItem()) {
                pickUpButton.setVisible(true);
                itemLabel.setText("<html>" + current.getItemPrompt() + "</html>");
            }
        }
    }

    //Checks which story options you can choose with the current items you have.
    public void checkForRightItem(javax.swing.JButton pickUpButton,
            javax.swing.JButton jButton1, javax.swing.JButton jButton2,
            javax.swing.JButton jButton3, javax.swing.JLabel jLabel3,
            javax.swing.JLabel jLabel4, javax.swing.JLabel jLabel5,
            ArrayList<String> inventory) {
        
        setChoiceText(current.left, jLabel3);
        //if we have the required item, button is enabled, otherwise it is disabled
        if (hasItemReq(current.left, inventory)) {
            jButton1.setEnabled(true);
        }
        else {
            jButton1.setEnabled(false);
        }

        //Check if other choices are null
        if (current.center.getChoice() != null) {
            //set button 2
            setChoiceText(current.center, jLabel4);
            if (hasItemReq(current.center, inventory)) {
                jButton2.setEnabled(true);
            }
            else {
                jButton2.setEnabled(false);
            }
        }

        if (current.right.getChoice() != null) {
            setChoiceText(current.right, jLabel5);
            if (hasItemReq(current.right, inventory)) {
                jButton3.setEnabled(true);
            }
            else {
                jButton3.setEnabled(false);
            }
        }
    }
    
    public void resetItems(EventNode overallRoot) {
        resetItemHelper(overallRoot.left);
        resetItemHelper(overallRoot.center);
        resetItemHelper(overallRoot.right);
    }
    
    public void resetItemHelper(EventNode current) { 
        if (current.left == null && current.right == null && current.center == 
                null) {
        }
        else if (!current.getCheckpoint()){
            if (current.getSavedEventItems() != null) {
                if(!current.getSavedEventItems().isEmpty()) {
                    current.eventItems = new ArrayList<String> (current.getSavedEventItems());
                }
            }
            resetItemHelper(current.left);
            resetItemHelper(current.center);
            resetItemHelper(current.right);
        }
    }

    //prints choice text. If choice requires an item, prints it as well.
    private void setChoiceText(EventNode next, javax.swing.JLabel choiceLabel) {
        if (next.needsItem()) {
            choiceLabel.setText(next.getChoice() + " (You need "
                    + next.requiredItems + " to proceed.)");
        } else {
            choiceLabel.setText(next.getChoice());
        }
    }

    //checks if user has items needed to proceed
    public boolean hasItemReq(EventNode next, ArrayList<String> inventory) { 
        boolean verify = true;
        if (next.needsItem()) {
            verify = hasAllItems(next, inventory);
        } 
        return verify;
    }

    //Checks if player has all items required to proceed to the next event
    private boolean hasAllItems(EventNode next, ArrayList<String> inventory) {
        for (String item : next.requiredItems) {
            if (!inventory.contains(item)) {
                return false;
            }
        }
        return true;
    }

    //set panel to play a game
    private void setPlay(javax.swing.JButton jButton1, javax.swing.JButton 
            jButton2, javax.swing.JButton jButton3, javax.swing.JLabel jLabel2,
            javax.swing.JLabel jLabel3, javax.swing.JLabel jLabel4,
            javax.swing.JLabel jLabel5, javax.swing.JLabel itemLabel,
            javax.swing.JButton pickUpButton, javax.swing.JButton 
                    checkpointButton, javax.swing.JLabel jLabel1) {
        //Sets labels to blank
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
        jLabel2.setText("");
        itemLabel.setText("");
        //makes all buttons and labels visible
        jButton1.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jButton3.setVisible(true);
        jButton2.setVisible(true);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        pickUpButton.setVisible(false);
        checkpointButton.setVisible(true);
        jLabel1.setVisible(true);
    }

    //Clears panel after game finishes
    private void clearPanel(javax.swing.JButton jButton1, javax.swing.JButton 
            jButton2, javax.swing.JButton jButton3, javax.swing.JLabel jLabel2,
            javax.swing.JLabel jLabel3, javax.swing.JLabel jLabel4,
            javax.swing.JLabel jLabel5, javax.swing.JLabel itemLabel, 
            javax.swing.JButton checkpointButton) {
        jButton1.setVisible(false);
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
        itemLabel.setText("");
        jButton3.setVisible(false);
        jButton2.setVisible(false);
        
    }

    //returns overallRoot
    public EventNode getOverallRoot() {
        return overallRoot;
    }
    
    public ArrayList<String> getSavedInventory() {
        return savedInventory;
    }
    
    public EventNode getLastCheckpoint() {
        return lastCheckpoint;
    }
}
