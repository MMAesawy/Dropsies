public class SignUpService {
    private static SignUpService ourInstance = new SignUpService();

    public static SignUpService getInstance() {
        return ourInstance;
    }

    private SignUpService() {
    }

    private boolean checkAvailability(String email, String phoneNumber){

    }

    public boolean signUp(User user){

    }
}
