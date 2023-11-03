import java.util.Scanner; //this will be used to read in test data 
//FIXME: if we are interfacing with other groups this will probably be removed

public class backend {
    ////Testing classes////
    public void printTestMenu(){
        System.out.println("Test Menu:");
        System.out.println("0) quit testing mode");
        System.out.println("1) Add user to database");
        System.out.println("2) Add scholarship to database");
        System.out.println("3) Remove user from database");
        System.out.println("4) Remove scholarship from database");
        System.out.println("5) Edit user in database");
        System.out.println("6) Edit scholarship in database");
        System.out.println("7) test email notification");
        System.out.println();
    }

    ////Testing classes////
    public static void main(String[] args) {
        userDatabase userData = new userDatabase();
        scholarshipDatabase scholarshipData = new scholarshipDatabase();
        //This creates an object of each of our databases
    }
}