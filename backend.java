import java.util.Scanner; //this will be used to read in test data 

public class backend {
    ////Testing classes////
    public void printTestMenu(){
        System.out.println("Test Menu:");
        System.out.println("0) quit testing mode");
        System.out.println("1) Test user database");
        System.out.println("2) Test scholarship database");
        System.out.println("3) test email notification");
        System.out.println("4) Admin create new user");
        System.out.println();
    }

    public void databaseTestMenu(){
        System.out.println("Database Test Menu:");
        System.out.println("1) Add object to database");
        System.out.println("2) Remove object from database");
        System.out.println("3) Edit object in database");
        System.out.println();
    }

    ////Testing classes////
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //This creates a scanner object to read in test data
        backend app = new backend(); //This creates an instance of the backend class
        userDatabase userData = new userDatabase();
        scholarshipDatabase scholarshipData = new scholarshipDatabase();
        //This creates an object of each of our databases
        boolean exit = false; //This is used to exit the program loop once the application is ended

        String baseAdminName = "Adimn1";
        String baseAdminPermissions = "admin"; 
        Admin admin = new Admin();
        admin.setName(baseAdminName);
        admin.setUserPermission(baseAdminPermissions);
        //This creates our base admin account which will be the only account in the database at the start

        userData.addToDatabase(admin); //This adds the admin to the database since they are the first user

        while(exit == false){ //This is our main loop
            app.printTestMenu();
            System.out.println("Enter a number to select an option: ");
            int appAction = input.nextInt(); //This reads in the user's option
            if(appAction == 0){
                exit = true; //This will exit the loop on the next iteration
            }
            else if(appAction == 1){ //This will be used for testing the user database
                app.databaseTestMenu();
            }
            else if(appAction == 2){ //This will be used for testing the scholarship database
                app.databaseTestMenu();
            }
            else if(appAction == 3){

            }
            else if(appAction == 4){
                admin.createAccount();
            }
            else{
                System.out.println("Invalid option. Please try again.");
            }
        }
        input.close(); //This closes the scanner object
    }
}