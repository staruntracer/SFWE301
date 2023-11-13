//This is a parent class for all users
//For this file we will use inheritance 
//The specific users will be a child 
public class user {
    private String name;
    private String emailAddress;
    private String securityQuestion; //CSV of the 3 security questions that can be split later through .split() method
    private String securityQuestionAnswers; //CSV of the 3 security questions that can be split later through .split() method

    public user(){ //default constructor 
        this.name = "No Name";
        this.emailAddress = "None";
        this.securityQuestion = "None";
        this.securityQuestionAnswers = "None";
    }

    ////// Overload constructors for the user class //////
    public user(String name){
        this.name = name;
        this.emailAddress = "None";
        this.securityQuestion = "None";
        this.securityQuestionAnswers = "None";
    }
    public user(String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
        this.securityQuestion = "None";
        this.securityQuestionAnswers = "None";
    }
    public user(String name, String emailAddress, String securityQuestion){
        this.name = name;
        this.emailAddress = emailAddress;
        this.securityQuestion = securityQuestion;
        this.securityQuestionAnswers = "None";
    }
    public user(String name, String emailAddress, String securityQuestion, String securityQuestionAnswers){
        this.name = name;
        this.emailAddress = emailAddress;
        this.securityQuestion = securityQuestion;
        this.securityQuestionAnswers = securityQuestionAnswers;
    }
    ////// End of overloaded constructors for the user class //////

    ////// Getters and Setters for the user class //////
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getSecurityQuestion(){
        return securityQuestion;
    }
    public void setSecurityQuestion(String securityQuestion){
        this.securityQuestion = securityQuestion;
    }
    public String getSecurityQuestionAnswers(){
        return securityQuestionAnswers;
    }
    public void setSecurityQuestionAnswers(String securityQuestionAnswers){
        this.securityQuestionAnswers = securityQuestionAnswers;
    }
    ////// End of getters and setters for the user class //////
    
}
