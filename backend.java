import java.util.Scanner; //this will be used to read in test data 

public class backend {
    ////Testing classes////
    public void printTestMenu(){
        System.out.println("Test Menu:");
        System.out.println("0) quit testing mode");
        System.out.println("1) Test user database");
        System.out.println("2) Test scholarship database");
        System.out.println("3) Admin create new user");
        System.out.println("4) Search scholarship by name");
        System.out.println("5) Search user by name");
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


        //FIXME: figure out how to swith user
        user currentUser = new user();

        while(exit == false){ //This is our main loop
            app.printTestMenu();
            System.out.println("Enter a number to select an option: ");
            int appAction = input.nextInt(); //This reads in the user's option
            int databaseAction; //This will be used to read in the user's option for the database test menu
            if(appAction == 0){
                exit = true; //This will exit the loop on the next iteration
            }
            else if(appAction == 1){ //This will be used for testing the user database
                app.databaseTestMenu();
                System.out.println("Enter a number to select an option: ");
                databaseAction = input.nextInt(); //This reads in the user's option
                if(databaseAction == 1){ //add to user database

                }
                else if(databaseAction == 2){ //remove from user database

                }
                else if(databaseAction == 3){ //edit user in database

                }
                else{
                    System.out.println("Invalid option. Please try again.");
                }
            }
            else if(appAction == 2){ //This will be used for testing the scholarship database
                app.databaseTestMenu();
                System.out.println("Enter a number to select an option: ");
                databaseAction = input.nextInt(); //This reads in the user's option
                if(databaseAction == 1){ //add to scholarship database

                }
                else if(databaseAction == 2){ //remove from scholarship database

                }
                else if(databaseAction == 3){   //edit scholarship in database

                }
                else{
                    System.out.println("Invalid option. Please try again.");
                }
            }
            else if(appAction == 3){
                admin.createAccount();
            }
            else if(appAction == 4){
                if(currentUser.getUserPermission() == "student" || currentUser.getUserPermission() == "reviewer" || currentUser.getUserPermission() == "admin"){
                    //This check the user permission we allow admins to do everything
                    scholarship foundScholarship;
                    System.out.println("Enter the name of the scholarship you would like to search for: ");
                    String scholarshipName = input.nextLine(); //This reads in the user's option
                    foundScholarship = scholarshipData.searchByName(scholarshipName);
                }
                else{
                    System.out.println("You do not have permission to perform this action.");
                }
            }
            else if(appAction == 5){
                if(currentUser.getUserPermission() == "admin"){
                    user foundUser;
                    System.out.println("Enter the name of the user you would like to search for: ");
                    String userName = input.nextLine(); //This reads in the user's option
                    foundUser = userData.searchByName(userName);
                } 
                else{
                    System.out.println("You do not have permission to perform this action.");
                }  
            }
            else{
                System.out.println("Invalid option. Please try again.");
            }
        }
        input.close(); //This closes the scanner object
    }
}