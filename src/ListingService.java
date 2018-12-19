
import java.util.ArrayList;

public class ListingService {
    private static ListingService ourInstance = new ListingService();

    public static ListingService getInstance() {
        return ourInstance;
    }

    private ListingService() {
    }

    public void createListing(User user, Item item, ArrayList<Question> questions){

    }

    public void addClaim(Listing listing, Claim claim){

    }

    public ArrayList<Claim> retrieveClaims(String listingID){

    }

    public void endListing(String listingID){

    }
}
