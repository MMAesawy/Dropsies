import java.util.ArrayList;

public class ClaimData implements DataController<Claim>{
    private static ClaimData ourInstance = new ClaimData();

    public static ClaimData getInstance() {
        return ourInstance;
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
