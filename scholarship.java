public class scholarship {
    private String scholarshipName;
    private String customRequiredInfo;

    public scholarship(){ //This is the constructor
        scholarshipName = "No Name";
        customRequiredInfo = "None";
    }

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
