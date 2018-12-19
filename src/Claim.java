import java.util.ArrayList;

public class Claim {
    private User claimant;
    private ArrayList<Question> answers;

    public Claim(){

    }

    public User getClaimant() {
        return claimant;
    }

    public ArrayList<Question> getAnswers() {
        return answers;
    }
}
