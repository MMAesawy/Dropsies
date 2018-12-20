public class LoginService {
    private static LoginService ourInstance = new LoginService();

    public static LoginService getInstance() {
        return ourInstance;
    }

    private LoginService() {
    }

    public boolean check(String email, String password){
        User user = UserData.getInstance().get(email);
        if(user != null){
            if(checkPassword(user, password)){
                return true;
            }
        }
        return false;
    }

    private String generateToken(User user){
        return null;
    }

    private boolean checkPassword(User user, String password){
        if(user.getPasswordHash() == password){
            return true;
        }
        else return false;
    }
}
