import java.util.ArrayList;

public class House {

    private String description;
    private boolean isLocked;
    private ArrayList<String> rooms;
    
    /* creates the house */

    public House(String description, boolean isLocked, int nRooms){
        this.rooms = new ArrayList<>();
    }

    /* returns the description of the house */

    public String description(){
        System.out.println("You are inside of a house.");
    }

    /* returns whether the house's door to the outside is locked */

    public boolean isLocked(){
        return this.isLocked;
    }

    /* returns the number of rooms in the house */

    public int nRooms(){
        return this.rooms.size();
    }

}

