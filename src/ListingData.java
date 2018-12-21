import java.util.ArrayList;

public class ListingData implements DataController<Listing>{
    private static ListingData ourInstance = new ListingData();
    private ArrayList<Listing> listings = new ArrayList<>();

    public static ListingData getInstance() {
        return ourInstance;
    }

    private ListingData() {
        initializeData();
    }

    private void initializeData(){
        ArrayList<Question> qs;

        qs = new ArrayList<>();
        qs.add(new Question("What's the color of the zamzameya?"));
        qs.add(new Question("How much water can it hold?"));
        listings.add(new Listing(
            ItemData.getInstance().get("0"),
                UserData.getInstance().get("dancydancy@pi.io"),
                qs
        ));
        qs.clear();

        qs = new ArrayList<>();
        qs.add(new Question("What's the name of the windows user account?"));
        listings.add(new Listing(
                ItemData.getInstance().get("1"),
                UserData.getInstance().get("dancydancy@pi.io"),
                qs
        ));
        qs.clear();

        qs = new ArrayList<>();
        qs.add(new Question("What's its maximum outputted force?"));
        listings.add(new Listing(
                ItemData.getInstance().get("2"),
                UserData.getInstance().get("winston@mercy.gg"),
                qs
        ));
        qs.clear();

        qs = new ArrayList<>();
        qs.add(new Question("What color is the lipstick?"));
        qs.add(new Question("What brand is the lipstick?"));
        listings.add(new Listing(
                ItemData.getInstance().get("3"),
                UserData.getInstance().get("xxx_catmax_@gg.gg"),
                qs
        ));
        qs.clear();

        qs = new ArrayList<>();
        qs.add(new Question("What's the briefcase lock code?"));
        listings.add(new Listing(
                ItemData.getInstance().get("4"),
                UserData.getInstance().get("iguesstheynever@miss.huh"),
                qs
        ));
        qs.clear();

        qs = new ArrayList<>();
        qs.add(new Question("Will it blend?"));
        listings.add(new Listing(
                ItemData.getInstance().get("5"),
                UserData.getInstance().get("winston@mercy.gg"),
                qs
        ));
        qs.clear();

        qs = new ArrayList<>();
        qs.add(new Question("What precious metal is it made out of?"));
        listings.add(new Listing(
                ItemData.getInstance().get("6"),
                UserData.getInstance().get("180@360.90"),
                qs
        ));
        qs.clear();

        qs = new ArrayList<>();
        qs.add(new Question("What's its secret?"));
        listings.add(new Listing(
                ItemData.getInstance().get("7"),
                UserData.getInstance().get("dancydancy@pi.io"),
                qs
        ));
        qs.clear();


    }

    @Override
    public void create(Listing listing) {
        if (get(listing.getId()) == null)
            listings.add(listing);
    }

    @Override
    public void update(Listing listing) {
        for (int i = 0; i < listings.size(); i++){
            if (listings.get(i).getId().equals(listing.getId())){
                listings.set(i, listing);
                break;
            }
        }
    }

    @Override
    public Listing get(String id) {
        for (int i = 0; i < listings.size(); i++){
            if (listings.get(i).getId().equals(id)){
                return listings.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<Listing> getAll() {
        return listings;
    }
}
