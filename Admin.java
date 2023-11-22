//This class inherits from the user class
import java.util.Scanner;
public class Admin extends user{
    private String adminID;

    public Admin(){ //Default constructor
        this.adminID = "None";
    }

    ///// Start Overloaded constructors for the Admin class /////
    public Admin(String adminID){
        this.adminID = adminID;
    }
    ///// End Overloaded constructors for the Admin class /////

    ///// Start Getters and Setters for the Admin class /////
    public String getAdminID(){
        return adminID;
    }
    public void setAdminID(String adminID){
        this.adminID = adminID;
    }
    ///// End Getters and Setters for the Admin class /////

    public void createAccount(){ //FIXME: get all of the relevant info (this might be a really long method)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter type of user: ");
        String userPermissions = input.nextLine();
        if(userPermissions == "student"){
            student newStudent = new student();
            newStudent.setUserPermission(userPermissions); //Sets the user permission
            setBasicInfo(newStudent, input); //FIXME: might be an issue with inheritance
            setStudentInfo(newStudent, input); //FIXME: might be an issue with inheritance or getting the information back
        }
        else if(userPermissions == "admin"){
            Admin newAdmin = new Admin();
            newAdmin.setUserPermission(userPermissions); //Sets the user permission
            setBasicInfo(newAdmin, input);
            setAdminInfo(newAdmin, input);
        }
        else if(userPermissions == "donor"){
            donor newDonor = new donor();
            newDonor.setUserPermission(userPermissions); //Sets the user permission
            setBasicInfo(newDonor, input);
            setDonorInfo(newDonor, input);
        }
        else if(userPermissions == "reviewer"){
            reviewer newReviewer = new reviewer();
            newReviewer.setUserPermission(userPermissions);  //Sets the user permission
            setBasicInfo(newReviewer, input);
            setReviewerInfo(newReviewer, input);
        }
        else{
            System.out.println("Invalid user type. Please try again.");
        }
        input.close(); //Closes the scanner
    }


    private user setBasicInfo(user inputUser, Scanner input){
        System.out.println("Enter name (ex. John Doe): ");
        String name = input.nextLine();
        inputUser.setName(name);
        System.out.println("Enter email address (ex. JohnDoe@email.com): ");
        String emailAddress = input.nextLine();
        inputUser.setEmailAddress(emailAddress);
        System.out.println("Please enter 3 security questions seperated by a comma and a space");
        System.out.println("Enter security question (ex. What is my favorite food, What is my favorite color, ...): ");
        String securityQuestion = input.nextLine();
        inputUser.setSecurityQuestion(securityQuestion);
        System.out.println("Please enter 3 security questions answers seperated by a comma and a space");
        System.out.println("Enter security question answers (ex. pizza, blue, ...): ");
        String securityQuestionAnswers = input.nextLine();
        inputUser.setSecurityQuestionAnswers(securityQuestionAnswers);
        return inputUser;
    }

    private student setStudentInfo(student inputStudent, Scanner input) {
        System.out.println("Enter major (ex. Software Engineering): ");
        String major = input.nextLine();
        inputStudent.setMajor(major);
        System.out.println("Enter GPA (ex. 3.5): ");
        double gpa = input.nextDouble();
        inputStudent.setGpa(gpa);
        System.out.println("Enter student ID (ex. 1234567): ");
        String studentID = input.nextLine();
        inputStudent.setStudentID(studentID);
        System.out.println("Enter citizenship (ex. US Citizen): ");
        String citizenship = input.nextLine();
        inputStudent.setCitizenship(citizenship);
        System.out.println("Enter units enrolled (ex. 12): ");
        int unitsEnrolled = input.nextInt();
        inputStudent.setUnitsEnrolled(unitsEnrolled);
        System.out.println("Enter expected graduation (ex. May, 2022): ");
        String expectedGraduation = input.nextLine();
        inputStudent.setExpectedGraduation(expectedGraduation);
        System.out.println("Enter burser account reference (ex. 1234567): ");
        String bursarAccountReference = input.nextLine();
        inputStudent.setBursarAccountReference(bursarAccountReference);
        return inputStudent;
    }

    private Admin setAdminInfo(Admin inputAdmin, Scanner input) {
        System.out.println("Enter admin ID (ex. 1234567): ");
        String adminID = input.nextLine();
        inputAdmin.setAdminID(adminID);
        return inputAdmin;
    }
    private donor setDonorInfo(donor inputDonor, Scanner input) {
        System.out.println("Enter burser account reference (ex. 1234567): ");
        String bursarAccountReference = input.nextLine();
        inputDonor.setBursarAccountReference(bursarAccountReference);
        System.out.println("Enter donor ID (ex. 1234567): ");
        String donorID = input.nextLine();
        inputDonor.setDonorID(donorID);
        return inputDonor;
    }
    private reviewer setReviewerInfo(reviewer inputReviewer, Scanner input) {
        System.out.println("Enter reviewer ID (ex. 1234567): ");
        String reviewerID = input.nextLine();
        inputReviewer.setReviewerID(reviewerID);
        return inputReviewer;
    }


    public void printInfo(){
        super.printInfo();
        System.out.println("Admin ID: " + this.adminID);
    }

}
