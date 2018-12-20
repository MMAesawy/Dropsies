import java.util.ArrayList;

public class Claim {
    private User claimant;
    private ArrayList<Question> answers;

    public Claim(User claimant, ArrayList<Question> answers) {
        this.claimant = claimant;
        this.answers = answers;
    }

    public User getClaimant() {
        return claimant;
    }

    public ArrayList<Question> getAnswers() {
        return answers;
    }
}
