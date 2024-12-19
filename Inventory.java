
import java.util.ArrayList;

/* constructor for a character's inventory */
public class Inventory {
    
    private ArrayList<Item> items;

    /* creates a character's inventory */
    public Inventory() {
        this.items = new ArrayList<>();
    } 

    /* adds an item to inventory */
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to your inventory.");
    }
    
    /* prints the inventory's contents */
    public void printInventory() {
        if (items.isEmpty()) {
            System.out.println("There are no items in your inventory.");
        } else {
            System.out.println("Your inventory contains:");
            for (Item item : items) {
                System.out.println("- " + item.getName());
        }
        }
    }
}