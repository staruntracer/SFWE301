//This is a parent class for all users
//For this file we will use inheritance 
//The specific users will be a child 
public class user {
    private String name;
    private String emailAddress;
    private String securityQuestion; //CSV of the 3 security questions that can be split later through .split() method
    private String securityQuestionAnswers; //CSV of the 3 security questions that can be split later through .split() method

    public user(){ //default constructor 
        name = "No Name";
        emailAddress = "None";
        securityQuestion = "None";
        securityQuestionAnswers = "None";
    }

    //FIXME: overload constructor
    
}
