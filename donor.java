//This class inherits from the user class
public class donor extends user{
    private String bursarAccountReference;

    public donor(){ //Default constructor
        this.bursarAccountReference = "None";
    }

    ///// Start Overloaded constructors for the donor class /////
    public donor(String bursarAccountReference){
        this.bursarAccountReference = bursarAccountReference;
    }
    ///// End Overloaded constructors for the donor class /////

    ///// Start Getters and Setters for the donor class /////
    public String getBursarAccountReference(){
        return bursarAccountReference;
    }
    public void setBursarAccountReference(String bursarAccountReference){
        this.bursarAccountReference = bursarAccountReference;
    }
    ///// End Getters and Setters for the donor class /////
}
