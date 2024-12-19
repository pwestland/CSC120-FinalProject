
import java.util.HashSet;
import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private Player player;
    private House house;

    public Game() {
        scanner = new Scanner(System.in);
        player = new Player("");
        house = new House();

        setupGame();
    }
    
    private void setupGame() {

        Room livingRoom = new Room("Living Room");
        Room kitchen = new Room("Kitchen");
        Room attic = new Room("Attic");

        house.addRoom("Living Room");
        house.addRoom("Kitchen");
        house.addRoom("Attic");

        livingRoom.addExit("north", kitchen);
        kitchen.addExit("up", attic);

        livingRoom.addItem("Flashlight", false);
        kitchen.addItem("Key", false);

        livingRoom.addClue("Item Clue", "There's a key somewhere...check the room with many appliances.");
        attic.addClue("Character Clue", "Finding the ghost will help you escape");

        HashSet<String> riddleAnswers = new HashSet<>();
        riddleAnswers.add("candle");
        Question riddle = new Question("I am tall when I am young, and I am short when I am old. What am I?", riddleAnswers);
        Ghost ghost = new Ghost("Riddler", riddle);
        attic.setHasGhost(true);
    }

    public void start() {
        Room currentRoom = house.getRoom("Living Room");
        
    }
    
}
