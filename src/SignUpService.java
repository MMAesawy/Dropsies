public class SignUpService {
    private static SignUpService ourInstance = new SignUpService();

    public static SignUpService getInstance() {
        return ourInstance;
    }

    private SignUpService() {

    }

    private boolean checkAvailability(String email){
        return UserData.getInstance().get(email)==null;
    }

    public boolean signUp(User user){
            if(checkAvailability(user.getEmail())){
                UserData.getInstance().create(user);
                return true;
            }
            else{
               return false;
            }
    }
}
