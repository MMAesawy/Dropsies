import java.util.ArrayList;

public class ListingData implements DataController<Listing>{
    private static ListingData ourInstance = new ListingData();

    public static ListingData getInstance() {
        return ourInstance;
    }

    private ListingData() {
    }

    @Override
    public void create(Listing listing) {

    }

    @Override
    public void update(Listing listing) {

    }

    @Override
    public Listing get(String id) {
        return null;
    }

    @Override
    public ArrayList<Listing> getAll() {
        return new ArrayList<>();
    }
}
