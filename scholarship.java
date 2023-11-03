public class scholarship {
    private String scholarshipName;
    private int payout;
    private String deadline;
    private String customRequiredInfo;
    private String preferedMajors;

    public scholarship(){ //This is the constructor
        scholarshipName = "No Name";
        payout = 0;
        deadline = "N/A";
        customRequiredInfo = "None";
        preferedMajors = "None";
    }
    //FIXME: add in overloading

    ///////// Start mutators and accessors /////////

    public void setScholarshipName(String name){
        scholarshipName = name; //This sets the scholarship name
    }

    public String getScholarshipName(){
        return scholarshipName; //This returns the scholarship name
    }

    public void setCustomRequiredInfo(String info){
        customRequiredInfo = info; //This sets the shcolarship info
    }

    public String getCustomRequiredInfo(){
        return customRequiredInfo; //This gets the scholarship info
    }


    ///////// End mutators and accessors /////////
    
}
