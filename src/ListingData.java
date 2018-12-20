import java.util.ArrayList;

public class ListingData implements DataController<Listing>{
    private static ListingData ourInstance = new ListingData();
    private ArrayList<Listing> listings = new ArrayList<>();

    public static ListingData getInstance() {
        return ourInstance;
    }

    private ListingData() {
    }

    private void initializeData(){
        listings.add(new Listing(
            ItemData.getInstance().get("0"),
                UserData.getInstance().get("dancyPoxels"),

        ));
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
