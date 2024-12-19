
public class Item {
    private String name;
    private boolean isClue;

    public Item(String name, boolean isClue) {
        this.name = name;
        this.isClue = isClue;
    }

    public String getName() {
        return name;
    }

    public boolean isClue() {
        return isClue;
    }
}
