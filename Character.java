
/* constructor for the character class */
public abstract class Character {
    
    protected String name;

    /* creates a character */
    public Character(String name) {
        this.name = name;
    }

    /* gets the name of the character */
    public String getName(){
        return name;
    }

    /* allows the character to interact with things */
    public abstract void interact();
}
