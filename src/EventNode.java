import java.util.ArrayList;

public class EventNode {

    //Fields
    private final String exposition;
    private final String choice;
    //Outside access to pointer nodes and items
    public EventNode left;
    public EventNode center;
    public EventNode right;
    public ArrayList<String> eventItems;
    private ArrayList<String> savedEventItems;
    public ArrayList<String> requiredItems;
    private String itemPrompt;
    private boolean checkpoint = false;
    private boolean trueEnd = false;

	//Constructs a new EventNode with title (choice that leads to event) 
    //and exposition
    public EventNode(String choice, String exposition) {
        ArrayList<String> eventItems = new ArrayList<String>();
        this.left = null;
        this.right = null;
        this.center = null;
        this.exposition = exposition;
        this.choice = choice;
        this.itemPrompt = null;
        this.eventItems = eventItems;
        this.requiredItems = null;
    }

    //Constructs a new EventNode with choice, exposition, and items/item prompt
    public EventNode(String choice, String exposition, String itemPrompt, 
            ArrayList<String> eventItems) {
        this.left = null;
        this.right = null;
        this.center = null;
        this.exposition = exposition;
        this.choice = choice;
        this.itemPrompt = itemPrompt;
        this.eventItems = eventItems;
        savedEventItems = new ArrayList<String>(eventItems);
        this.requiredItems = null;
    }
    
    //Constructs a new EventNode with required items to arrive at this node
    public EventNode(String choice, String exposition, ArrayList<String> 
            requiredItems) {
        ArrayList<String> eventItems = new ArrayList<String>();
        this.left = null;
        this.right = null;
        this.center = null;
        this.exposition = exposition;
        this.choice = choice;
        this.itemPrompt = null;
        this.eventItems = eventItems;
        this.requiredItems = requiredItems;
    }
    
    
    //Constructs a new EventNode with items to pick up AND required items to arrive
    public EventNode(String choice, String exposition, String itemPrompt, 
            ArrayList<String> eventItems, ArrayList<String> requiredItems) {
        this.left = null;
        this.right = null;
        this.center = null;
        this.exposition = exposition;
        this.choice = choice;
        this.itemPrompt = itemPrompt;
        this.eventItems = eventItems;
        savedEventItems = new ArrayList<String>(eventItems);
        this.requiredItems = requiredItems;
    }

    //Constructs a new EventNode
    public EventNode(EventNode left, EventNode right, EventNode center,
            String exposition, String choice, String itemPrompt, 
            ArrayList<String> eventItems, ArrayList<String> requiredItems) {
        this.left = left;
        this.right = right;
        this.center = center;
        this.exposition = exposition;
        this.choice = choice;
        this.itemPrompt = itemPrompt;
        this.eventItems = eventItems;
        savedEventItems = new ArrayList<String>(eventItems);
        this.requiredItems = requiredItems;
    }

    //Returns choice label
    public String getChoice() {
        return choice;
    }

    //Returns event exposition
    public String getExposition() {
        return exposition;
    }
    
    //returns true if event has an item
    public boolean hasItem() {
        return !eventItems.isEmpty();
    }
    
    //returns true if even needs an item
    public boolean needsItem() {
        return requiredItems !=null;
    }
    
    public String getItemPrompt() {
        return itemPrompt;
    }
    
    public void changeItemPrompt(String line) {
        itemPrompt = line;
    }
    
    public void setCheckpoint(boolean checkpoint) {
        this.checkpoint = checkpoint;
    }
    
    public boolean getCheckpoint() {
        return checkpoint;
    }
    
    public ArrayList<String> getSavedEventItems() {
        return savedEventItems;
    }
    
    public void setFinalEnding(boolean end) {
        trueEnd = end;
    }
    
    public boolean isFinalEnding() {
        return trueEnd;
    }
}
