
import java.util.HashSet;

/* constructor for the question class */
public class Question {
    
    private String questionText;
    private HashSet<String> validAnswers;

    /* creates a question */
    public Question(String questionText, HashSet<String> validAnswers) {
        this.questionText = questionText;
        this.validAnswers = validAnswers;
    }

    /* gets the question's text */
    public String getQuestionText() {
        return questionText;
    }

    /* checks if the answer given is in the list of valid answers */
    public boolean isValidAnswer(String answer) {
        return validAnswers.contains(answer.trim().toLowerCase());
    }

}
