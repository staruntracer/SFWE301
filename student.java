//This student class inherits from the user class
public class student extends user{
    private String major;
    private int gpa;
    private String studentID; //FIXME: do we want this as a string or int for comparisons
    private String citizenship;
    private int unitsEnrolled; //FIXME: do we want this as a string or int for comparisons
    private String expectedGraduation;
    private String essayResponses; //FIXME: may need a new database for this or we make an array of long strings here????
    private String bursarAccountReference;
    //FIXME: how do we want to do this ----->     private scholarship awardedScholarship;

    public student(){//This is the default constructor for the student class
        major = "None";
        gpa = 0;
        studentID = "None";
        citizenship = "None";
        unitsEnrolled = 0;
        expectedGraduation = "None";
        essayResponses = "None"; //FIXME: may need a new database for this or we make an array of long strings here????
        bursarAccountReference = "None";
    }
    //FIXME: add in overloading
}
