
/* constructor for the clue class */
public class Clue extends Item {

    private String clueText;

    /* creates a clue */
    public Clue(String name, String clueText) {
        super(name, true);
        this.clueText = clueText;
    }

    /* gets the text of the clue */
    public String getClueText() {
        return clueText;
    }
}
