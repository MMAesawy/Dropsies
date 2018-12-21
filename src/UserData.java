import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class UserData implements DataController<User>{
    private static UserData ourInstance = new UserData();
    private ArrayList<User> users = new ArrayList<>();

    public static UserData getInstance() {
        return ourInstance;
    }

    private UserData() {
        initializeData();
    }

    private void initializeData(){
        SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd");
        try {
            users.add(new User(
                    "dancyPoxels",
                    "dancydancy@pi.io",
                    "15949330798",
                    dateParser.parse("1999-11-11"),
                    "fancierdancy"
            ));
            users.add(new User(
                    "catcatmr",
                    "xxx_catmax_@gg.gg",
                    "7842160005",
                    dateParser.parse("1979-08-19"),
                    "meowbowo"
            ));
            users.add(new User(
                    "cat_lover_15k",
                    "iluvcats@purr.cat",
                    "898989898",
                    dateParser.parse("2000-07-10"),
                    "kalotcha"
            ));
            users.add(new User(
                    "best_developer",
                    "dev@computer.c++",
                    "000000000",
                    dateParser.parse("2014-01-05"),
                    "helloworld"
            ));
            users.add(new User(
                    "tracer",
                    "winston@mercy.gg",
                    "123468181",
                    dateParser.parse("2014-09-26"),
                    "iwannabetracer"
            ));
            users.add(new User(
                    "hitormiss",
                    "iguesstheynever@miss.huh",
                    "11105555062",
                    dateParser.parse("2018-03-22"),
                    "killme"
            ));
            users.add(new User(
                    "habababa",
                    "180@360.90",
                    "01010101010",
                    dateParser.parse("1990-12-18"),
                    "fortniteepicgamer69"
            ));
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }

    @Override
    public void create(User user) {
        if (get(user.getEmail()) == null)
            users.add(user);
    }

    @Override
    public void update(User user) {
        for (int i = 0; i < users.size(); i++){
            if (users.get(i).getEmail().equals(user.getEmail())){
                users.set(i, user);
                break;
            }
        }
    }

    @Override
    public User get(String id) {
        for (int i = 0; i < users.size(); i++){
            if (users.get(i).getEmail().equalsIgnoreCase(id)){
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<User> getAll() {
        return users;
    }
}
