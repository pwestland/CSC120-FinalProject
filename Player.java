
import java.util.HashSet;

public class Player extends Character {
    
    private boolean Inventory inventory;
    private HashSet<String> completedTasks;

    public Player(String name) {
        super(name);
        inventory = new Inventory();
        completedTasks = new HashSet<>();
    }

    @Override
    public void interact(){
        System.out.println(name + " looks around.");
    }

    public void addItem(Item item) {
        inventory.addItem(item);
    }

    public void printInventory() {
        inventory.printInventory();
    }

    public void markTaskComplete(String task) {
        completedTasks.add(task);
    }

    public boolean hasEscaped() {
        return completedTasks.size() >=3;
    }
}
