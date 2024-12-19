
import java.util.HashSet;

/* constructor for the character class */
public class Player extends Character {
    
    private Inventory inventory;
    private HashSet<String> completedTasks;

    /* creates a character */
    public Player(String name) {
        super(name);
        inventory = new Inventory();
        completedTasks = new HashSet<>();
    }

    /* overrides the interact method to let the player explore */
    @Override
    public void interact(){
        System.out.println(name + " explores the house.");
    }

    /* adds an item to the player's inventory */
    public void addItem(Item item) {
        inventory.addItem(item);
    }

    /* prints the player's inventory */
    public void printInventory() {
        inventory.printInventory();
    }

    /* marks a task as complete */
    public void markTaskComplete(String task) {
        completedTasks.add(task);
    }

    /* checks if the player has escaped by how many tasks they've completed */
    public boolean hasEscaped() {
        return completedTasks.size() >=3;
    }
}
