import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;


public class Main {

    static String loginUserEmail;

    public static void main(String[] args) {
        int choice;
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        while(flag){
            System.out.println("1. Sign-up");
            System.out.println("2. Login");
            System.out.println("3. Search for an item");
            System.out.println("4. Report an item");
            System.out.println("0. Exit");
            System.out.print("Make your choice: ");
            try{
                choice = s.nextInt();
                if(choice == 1){//register
                    signup();
                }
                else if(choice == 2){//login
                    login();
                }
                else if(choice == 3){//search
                    search();
                }
                else if(choice == 4){//report
                    report();
                }
                else if(choice == 0){
                    flag = false;
                }
                else{
                    System.out.print("Invalid choice!");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input. Aborting.");
                System.exit(0);
            }
        }
    }
    public static void signup(){
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.next();

        System.out.print("Email: ");
        String email = s.next();


        System.out.print("Phone number: ");
        String phoneNumber = s.next();

        Date dob=null;
        System.out.print("Date of birth in yyyy-MM-dd format: ");
        try {
            SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd");
            String DOB = s.next();
            dob=dateParser.parse(DOB);
        }
        catch (ParseException e){
            e.printStackTrace();
        }

        System.out.print("Password: ");
        String password = s.next();

        User user= new User(name,email,phoneNumber,dob,password);

        if(SignUpService.getInstance().signUp(user)){
            System.out.println("You successfully registered!");
        }
        else {System.out.println("The email you used has been already registered");
        }
    }
    public static void login(){
        Scanner s = new Scanner(System.in);
        System.out.print("Email: ");
        String email = s.next();
        System.out.print("Password: ");
        String password = s.next();
        if(LoginService.getInstance().check(email,password)){
            loginUserEmail = email;
            System.out.println("Welcome, " + UserData.getInstance().get(email).getName() +"!");
        }
        else{
            System.out.println("Incorrect email or password!");
        }

    }
    public static void search(){
        Scanner s = new Scanner(System.in);
        System.out.print("Name of item you'd like to search for: ");
        String itemName = s.next();
        Item myItem = ListingService.getInstance().searchItems(itemName);
        if (myItem == null){System.out.println("Could not find item...");}
        else{
            System.out.println(myItem.getName());
            System.out.println("Description: " + myItem.getDescription());
            System.out.println("Item found in: " + myItem.getLocationFound());
        }

    }
    public static void report() {
        Scanner s = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<>();

        System.out.print("Item name: ");
        String itemName = s.next();

        System.out.print("Location of where item was found: ");
        String itemLocation = s.next();

        System.out.print("Description of item: ");
        String itemDescription = s.next();

        System.out.println("Do you want to provide a question about said item? ");
        String YN = s.next();

        Item myItem = new Item(itemName,itemDescription,itemLocation);

        if (YN.equals("Y")){
            System.out.println("How many questions? ");
            String questionNum = s.next();
            int qn = Integer.valueOf(questionNum);
            for (int i=0; i<qn; i++){
                System.out.println("Please enter your questions: ");
                String question = s.next();
                System.out.println("Please enter your answer: ");
                String answer = s.next();
                Question q = new Question(question,answer);
                questions.add(q);
            }
            ListingService.getInstance().createListing(UserData.getInstance().get(loginUserEmail),myItem,questions);
        }

        else if (YN.equals("N")){
            System.out.println("No question provided...");
            ListingService.getInstance().createListing(UserData.getInstance().get(loginUserEmail),myItem);
        }

    }
}
