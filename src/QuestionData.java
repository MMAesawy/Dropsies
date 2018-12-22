import java.util.ArrayList;

public class QuestionData implements DataController<Question>{
    private static QuestionData ourInstance = new QuestionData();
    private ArrayList<Question> questions = new ArrayList<>();

    public static QuestionData getInstance() {
        return ourInstance;
    }

    private QuestionData() {
        initializeData();
    }

    private void initializeData(){

    }

    @Override
    public void create(Question question) {

    }

    @Override
    public void update(Question question) {

    }

    @Override
    public Question get(String id) {
        return null;
    }

    @Override
    public ArrayList<Question> getAll() {
        return new ArrayList<>();
    }
}
