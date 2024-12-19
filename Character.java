
import java.util,*;

public abstract class Character {
    
    protected String name;
    protected Inventory inventory;
}

public Character(String name) {
    this.name = name;
    this.inventory = new Inventory();
}

