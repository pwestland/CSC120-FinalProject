
import java.util.Collection;
import java.util.HashMap;

/* constructor for house */
public class House {

    private HashMap<String, Room> rooms;

    /* makes the house */
    public House() {
        rooms = new HashMap<>();
    }
    
    /* adds a room to the list of rooms */
    public void addRoom(String name, Room room) {
        rooms.put(name, room);
    }

    /* prints the rooms */
    public Room getRoom(String name) {
        return rooms.get(name);
    }

    /* returns the number of rooms */
    public Collection<Room> getRooms() {
        return rooms.values();
    }
}