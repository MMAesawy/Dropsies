import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;
    private String passwordHash;
    private boolean isActivated;
    private ArrayList<String> tokenArray;

    public User(String name, String email, String phoneNumber, Date dateOfBirth, String passwordHash) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.passwordHash = passwordHash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void activate() {
        isActivated = true;
    }

    public ArrayList<String> getTokenArray() {
        return tokenArray;
    }

    public void setTokenArray(ArrayList<String> tokenArray) {
        this.tokenArray = tokenArray;
    }
}
