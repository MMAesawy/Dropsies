import java.util.ArrayList;

public class ClaimData implements DataController<Claim>{
    private static ClaimData ourInstance = new ClaimData();
    private ArrayList<Claim> claims = new ArrayList<>();

    public static ClaimData getInstance() {
        return ourInstance;
    }

    private ClaimData(){
        initializeData();
    }

    private void initializeData(){
    }

    @Override
    public void create(Claim claim) {

    }

    @Override
    public void update(Claim claim) {

    }

    @Override
    public Claim get(String id) {
        return null;
    }

    @Override
    public ArrayList<Claim> getAll() {
        return new ArrayList<>();
    }
}
