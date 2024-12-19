
/* item class */
public class Item {
    private String name;
    private boolean isClue;


    /* creates an item */
    public Item(String name, boolean isClue) {
        this.name = name;
        this.isClue = isClue;
    }

    /* returns the name of an item */
    public String getName() {
        return name;
    }

    /* returns whether an item is a clue */
    public boolean isClue() {
        return isClue;
    }
}
