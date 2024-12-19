
public class Ghost extends Character {
    
    private Question riddle;

    public Ghost(String name, Question riddle) {
        super(name);
        this.riddle = riddle;
    }

    @Override
    public void interact() {
        System.out.println(name + " has a riddle for you: " + riddle.getQuestionText());
    }

    public boolean answerRiddle(String answer) {
        return riddle.isValidAnswer(answer);
    }
}