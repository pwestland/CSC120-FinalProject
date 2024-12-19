
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

        house.addRoom("Living Room", livingRoom);
        house.addRoom("Kitchen", kitchen);
        house.addRoom("Attic", attic);

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
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("\nYou are in the " + currentRoom.getDescription());
            System.out.println("What do you want to do?");
            player.printInventory();

            if (currentRoom.hasGhost()) {
                Ghost ghost = new Ghost("", new Question("", new HashSet<>()));
                ghost.interact();
                System.out.print("What am I?");
                String answer = scanner.nextLine();
                if (ghost.answerRiddle(answer)) {
                    player.addItem(new Item("Ghost's Amulet", false));
                } else {
                    System.out.println("Wrong answer :( try again.");
                }
            }

            if (!currentRoom.getItems().isEmpty()) {
                System.out.println("You have found an item: " + currentRoom.getItems().get(0).getName());
                player.addItem(currentRoom.getItems(),get(0));
                currentRoom.getItems().clear();
            }

            System.out.println("Where do you want to go?");
            for (String direction : currentRoom.getExits().keySet()) {
                System.out.println("To the " + direction + ": " + currentRoom.getExits().get(direction).getDescription());
            }

            String direction = scanner.nextLine().trim().toLowerCase();
            if (currentRoom.getExits().containsKey(direction)) {
            currentRoom = currentRoom.getExits().get(direction);
            } else {
                System.out.println("Invalid direction, try again.");
            }

            if (player.hasEscaped()) {
                System.out.println("You escaped!");
                gameOver = true;
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
    
}
