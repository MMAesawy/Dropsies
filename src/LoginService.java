public class LoginService {
    private static LoginService ourInstance = new LoginService();

    public static LoginService getInstance() {
        return ourInstance;
    }

    private LoginService() {
    }

    public String check(String email, String password){

    }

    private String generateToken(User user){

    }

    private boolean checkPassword(User user, String password){

    }
}
