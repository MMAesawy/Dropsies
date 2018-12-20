import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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

                    System.out.print("Date of birth in yyyy-MM-dd format: ");
                    try {
                        SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd");
                        String DOB = s.next();
                        dateParser.parse(DOB);
                    }
                    catch (ParseException e){
                        e.printStackTrace();
                    }
                    System.out.print("Password: ");
                    String password = s.next();

                }
                else if(choice == 2){
                    //login
                    System.out.print("Email: ");
                    String email = s.next();
                    System.out.print("Password: ");
                    String password = s.next();
                    if(LoginService.getInstance().check(email,password)){
                        System.out.println("Welcome, " + UserData.getInstance().get(email).getName() +"!");
                        loginUserEmail = email;
                    }
                    else{
                        System.out.println("Incorrect email or password!");
                    }
                }
                else if(choice == 3){
                    //search
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
                else if(choice == 4){
                    //report
                    ArrayList<Question> questions = new ArrayList<>();

                    System.out.print("Item name: ");
                    String itemName = s.next();

                    System.out.print("Item description: ");
                    String itemDescription = s.next();

                    System.out.print("Location of where item was found: ");
                    String itemLocation = s.next();

                    System.out.println("Do you want to provide a question about said item? ");
                    String YN = s.next();

                    Item myItem = new Item(itemName,itemDescription,itemLocation);

                    if (YN == "Y"){
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

                    else if (YN == "N"){
                        System.out.println("No question provided...");
                        ListingService.getInstance().createListing(UserData.getInstance().get(loginUserEmail),myItem);
                    }



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
