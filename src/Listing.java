import java.util.ArrayList;
import java.util.Date;

public class Listing {
    private static int idPool = 0;
    private Item item;
    private User reporter;
    private ArrayList<Claim> claims;
    private ArrayList<Question> questions;
    private Date date;
    private String id;
    private boolean isArchived;

    public Listing(Item item, User reporter, ArrayList<Question> questions) {
        this.item = item;
        this.reporter = reporter;
        this.questions = questions;
        id = "" + idPool++;
        date = new Date(System.currentTimeMillis());
    }

    public Listing(Item item, User reporter) {
        this.item = item;
        this.reporter = reporter;
        id = "" + idPool++;
        date = new Date(System.currentTimeMillis());
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getReporter() {
        return reporter;
    }

    public void setReporter(User reporter) {
        this.reporter = reporter;
    }

    public ArrayList<Claim> getClaims() {
        return claims;
    }

    public void setClaims(ArrayList<Claim> claims) {
        this.claims = claims;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void archive() {
        isArchived = true;
    }
}
