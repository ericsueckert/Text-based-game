
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Potato
 */
public class EventSubTree {

    private EventNode overallRoot;
    public EventNode current;
    //Fields used for return nodes
    private static Map<EventNode, Integer> returnNodles = new HashMap<EventNode, 
            Integer>();

    //Loads one subtree
    public void load(Scanner in, EventNode[] allRoots) {
        //initializes overallRoot at top of tree
        overallRoot = loadHelper(in, overallRoot, allRoots);
    }

    private EventNode loadHelper(Scanner in, EventNode current, EventNode[] 
            allRoots) {
        String line = in.nextLine();
        System.out.println(line);
        if (line.contains("//")) {
            System.out.println("too few lines in tree");
        }

        //If empty node, do nothing
        if (line.startsWith("E")) {
            current = new EventNode(null, null);
        } 
        else {
            //Loads title and exposition to current event
            ArrayList<String> eventItems;
            ArrayList<String> requiredItems = new ArrayList<String>();
            //Divides choice and exposition
            int divider = line.indexOf(" | ");
            String choice = line.substring(4, divider);
            String exposition = line.substring(divider + 2);
            //Detects if there is an item in the event

            //If there is both a required item, and an event item
            if (line.contains("$") && line.contains("(")) {
                //Split exposition from the rest
                String[] divide = exposition.split("[$]");
                //Split required item from event item
                String[] eventAndRequiredItems = divide[1].split("[(]");
                //Split item message from item name and number
                String[] divideItemName = eventAndRequiredItems[0].split("[*]");
                //Add item prompt message into event
                String itemPrompt = addItemPrompt(divideItemName[0]);
                //Add item number and name into event
                eventItems = addItem(divideItemName[1]);

                //Adds required item
                String[] divideItemName2 = eventAndRequiredItems[1].split("[=]");
                //Loops to add all required items
                for (int i = 0; i < Integer.parseInt(divideItemName2[1].trim());
                        i++) {
                    requiredItems.add(divideItemName2[0].trim());
                }

                //Constructs the node
                current = new EventNode(choice, divide[0], itemPrompt,
                        eventItems, requiredItems);
                
            } //If there is only an event item
            else if (line.contains("$")) {
                //Splits the item message from the item data
                String[] divide = exposition.split("[$]");
                //Splits the item name from the item count
                String[] divideItemName = divide[1].split("[*]");
                //sets a string equal to the item message
                String itemPrompt = addItemPrompt(divideItemName[0]);
                //sets the map equal to the item name and count
                eventItems = addItem(divideItemName[1]);
                //Construct an event node with the item
                current = new EventNode(choice, divide[0], itemPrompt,
                        eventItems);
                
            } //If there is only a required item
            else if (line.contains("(")) {
                //Split exposition from item info
                String[] divide = exposition.split("[(]");
                //Split each type of item
                String[] allItems = itemsToArray(divide[1]);

                //separate each item from its number
                for (String item : allItems) {
                    //Split item name from number of items
                    String[] divideItemName = divide[1].split("[=]");
                    //Add as many items as indicated
                    for (int i = 0; i < Integer.parseInt(divideItemName[1].trim()); i++) {
                        //add item to list
                        requiredItems.add(divideItemName[0].trim());
                    }
                }

                current = new EventNode(choice, divide[0], requiredItems);
            } 
            //If there is no item
            else {
                //construct a node without an item
                current = new EventNode(choice, exposition);
            }
        }

        //Continues to build tree if not an end node
        if (line.startsWith("S")) {
            //Build left, center, and right nodes.
            current.left = loadHelper(in, current.left, allRoots);
            current.center = loadHelper(in, current.center, allRoots);
            current.right = loadHelper(in, current.right, allRoots);
        }

        if (line.startsWith("N")) {
            //accomodates double digits
            String number = line.substring(2, 4);
            int treePoint = Integer.parseInt(number) - 1;
            current.left = allRoots[treePoint];
            current.center = new EventNode(null, null);
            current.right = new EventNode(null, null);
        }

        //If the line is a return node
        if (line.startsWith("R")) {
            //accomodates double digits
            String number = line.substring(2, 4);
            int treePoint = Integer.parseInt(number) - 1;
            current.left = allRoots[treePoint];
            current.center = new EventNode(null, null);
            current.right = new EventNode(null, null);
            //Saves the current node into an array list
            returnNodles.put(current, treePoint);
        }
        
        if (line.startsWith("G")) {
            current.setFinalEnding(true);
        }

        //return current node
        return current;
    }

    //reassigns return nodes
    public static void reassignReturnNodes(EventNode[] allRoots) {
        for (EventNode current : returnNodles.keySet()) {
            current.left = allRoots[returnNodles.get(current)];
        }
    }

    //returns string of item prompt
    private String addItemPrompt(String line) {
        return line.substring(1);
    }

    //returns items in event
    private ArrayList<String> addItem(String line) {
        ArrayList<String> item = new ArrayList<String>();

        //Separates all item types and puts them in an array
        String[] allItems = itemsToArray(line);

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

    private String[] itemsToArray(String line) {
        return line.split("[,]");
    }

    //returns overallRoot
    public EventNode getOverallRoot() {
        return overallRoot;
    }

}
