
import java.util.ArrayList;
import java.util.Scanner;

public class House {

    private String description;
    private boolean isLocked;
    private ArrayList<String> rooms;
    private Scanner input = new Scanner(System.in);
    public ArrayList<String> gameLog;
    
    /* creates the house */

    public House(String description, boolean isLocked, int nRooms){
        this.rooms = new ArrayList<>();
        this.gameLog = new ArrayList<>();
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

    public void playGame() {
        System.out.println("Enter 'Start' to begin the game.");
        userInput = input.nextLine().toLowerCase();
        if (userInput.equals("start")){

        }


    }



    public static void main(String[] args) {
        
    }

}

