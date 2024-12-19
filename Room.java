
import java.util.ArrayList;
import java.util.HashMap;

/* constructor for the rooms */
public class Room {
    
    private String description;
    private ArrayList<String> items;
    private HashMap<String, Room> exits;
    private boolean hasGhost;
    private ArrayList<String> clues;

    /* creates a room */
    public Room(String description) {
        this.description = description;
        this.items = new ArrayList<>();
        this.exits = new HashMap<>();
        this.clues = new ArrayList<>();
        this.hasGhost = false;
    }

    /* gets the room's description */
    public String getDescription() {
        return description;
    }

    /* adds an item to the items list */
    public void addItem(String item, boolean isClue) {
        items.add(item);
    }

    /* adds an exit to the room */
    public void addExit(String direction, Room room) {
        exits.put(direction, room);
    }
    
    /* adds a clue to the clues list */
    public void addClue(String clue, String clueText) {
        clues.add(clue);
        clues.add(clueText);
    }

    /* returns the exits in the room */
    public HashMap<String, Room> getExits() {
        return exits;
    }

    /* returns the items in the items list */
    public ArrayList<String> getItems() {
        return items;
    }

    /* returns the clues in the clues list */
    public ArrayList<String> getClues() {
        return clues;
    }

    /* returns whether a ghost is in the room */
    public boolean hasGhost() {
        return hasGhost;
    }

    /* sets whether there's a ghost in the room */
    public void setHasGhost(boolean hasGhost) {
        this.hasGhost = hasGhost;
    }
}
