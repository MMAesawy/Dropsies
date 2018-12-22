import java.util.HashMap;

public class ActivationService {
    private static ActivationService ourInstance = new ActivationService();
    private HashMap<User, String> codes;

    public static ActivationService getInstance() {
        return ourInstance;
    }

    private ActivationService() {
    }

    public void sendVerification(String id){

    }

    public boolean verify(String id, String code){
        return true;
    }
}
