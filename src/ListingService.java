
import java.util.ArrayList;

public class ListingService {
    private static ListingService ourInstance = new ListingService();

    public static ListingService getInstance() {
        return ourInstance;
    }

    private ListingService() {
    }

    public void createListing(User user, Item item, ArrayList<Question> questions){
        Listing myList = new Listing();
        myList.setItem(item);
        myList.setReporter(user);
        myList.setQuestions(questions);
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

    public Item searchItems(String itemName){
        ArrayList<Item> Items = ItemData.getInstance().getAll();
        for (int i=0; i<Items.size()-1; i++){
            if (itemName == Items.get(i).getName()){
                return Items.get(i);
            }
        }
        return null;
    }
}
