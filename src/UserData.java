import java.util.ArrayList;

public class UserData implements DataController<User>{
    private static UserData ourInstance = new UserData();

    public static UserData getInstance() {
        return ourInstance;
    }

    private UserData() {
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public ArrayList<User> getAll() {
        return new ArrayList<>();
    }
}
