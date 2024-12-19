
/* constructor for the ghost class */
public class Ghost extends Character {
    
    private Question riddle;

    /* creates a ghost */
    public Ghost(String name, Question riddle) {
        super(name);
        this.riddle = riddle;
    }

    /* overrides the interact method so the ghost can present the riddle */
    @Override
    public void interact() {
        System.out.println(name + " has a riddle for you: " + riddle.getQuestionText());
    }

    /* checks if the user's input is a valid answer to the riddle */
    public boolean answerRiddle(String answer) {
        return riddle.isValidAnswer(answer);
    }
}