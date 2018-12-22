
import java.util.ArrayList;

public class ListingService {
    private static ListingService ourInstance = new ListingService();

    public static ListingService getInstance() {
        return ourInstance;
    }

    private ListingService() {
    }

    public void createListing(User user, Item item, ArrayList<Question> questions){
        Listing myList = new Listing(item,user,questions);
        ListingData.getInstance().create(myList);
    }

    public void createListing(User user, Item item){
        Listing myList = new Listing(item,user);
        ListingData.getInstance().create(myList);
    }

    public void addClaim(Listing listing, Claim claim){
        listing.getClaims().add(claim);
    }

    public ArrayList<Claim> retrieveClaims(String listingID){
        return ListingData.getInstance().get(listingID).getClaims();
    }

    public void endListing(String listingID){
        ListingData.getInstance().get(listingID).archive();
    }

    public Listing searchListings(String itemName){
        ArrayList<Listing> listings = ListingData.getInstance().getAll();
        for (int i=0; i<listings.size(); i++){
            if (itemName.equalsIgnoreCase(listings.get(i).getItem().getName())){
                return listings.get(i);
            }
        }
        return null;
    }
}
