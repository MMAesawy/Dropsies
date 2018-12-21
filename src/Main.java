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
                if(choice == 1){
                    //register
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
                    else {System.out.println("The email you used has been already registered"); }

                }
                else if(choice == 2){
                    //login
                    System.out.print("Email: ");
                    String email = s.next();
                    System.out.print("Password: ");
                    String password = s.next();
                    if(LoginService.getInstance().check(email,password)){
                        System.out.println("Welcome, " + UserData.getInstance().get(email).getName() +"!");
                    }
                    else{
                        System.out.println("Incorrect email or password!");
                    }
                }
                else if(choice == 3){
                    //search
                    System.out.print("Name of item you'd like to search for: ");
                    String itemName = s.next();
                }
                else if(choice == 4){
                    //report
                    System.out.print("Item name: ");
                    String itemName = s.next();

                    System.out.print("Item description: ");
                    String itemDescription = s.next();

                    System.out.print("Location of where item was found: ");
                    String itemLocation = s.next();

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
}
