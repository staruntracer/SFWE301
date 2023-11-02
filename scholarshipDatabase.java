import java.util.ArrayList;
public class scholarshipDatabase {
    private ArrayList <scholarship> database = new ArrayList<>(); //This is our arraylist mock database
    
    public void addToDatabase(scholarship newScholarship){ 
        database.add(newScholarship); //This adds a new scholarship to the database
    }

    public void removeFromDatabase(){ //FIXME: figure out parameters
        //FIXME: figure out search parameters 
    }

    public scholarship editScholarshipInDatabase(){ //FIXME: figure our parameters
        scholarship scholarshipToEdit = null; //fixme this is temporary

        return scholarshipToEdit; //This returns the updated version of the scholarship
    }
}
