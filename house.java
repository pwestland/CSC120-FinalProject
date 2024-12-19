
import java.util.ArrayList;

/* constructor for house */
public class House {

    private ArrayList<String> rooms;

    /* makes the house */
    public House() {
        rooms = new ArrayList<>();
    }
    
    /* adds a room to the list of rooms */
    public void addRoom(String name) {
        rooms.add(name);
    }

    /* prints the rooms */
    public void allRooms() {
        for(int i = 0; i < rooms.size(); i++) {
            System.out.print(rooms.get(i));
        }
    }
}

