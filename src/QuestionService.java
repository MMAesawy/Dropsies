import java.util.ArrayList;

public class QuestionService {
    private static QuestionService ourInstance = new QuestionService();

    public static QuestionService getInstance() {
        return ourInstance;
    }

    private QuestionService() {
    }

    public Question getCopy(Question question){
        return null;
    }

    public ArrayList<Question> getVerificationFormCopy(Listing listing){
        return null;
    }
}
