import java.util.ArrayList;
public class scholarshipDatabase {
    private ArrayList <scholarship> database; //This is our arraylist mock database
    
    public scholarshipDatabase(){ //This is the default constructor
        this.database = new ArrayList<>();
    }
    ///// Start Overloaded constructors for the scholarshipDatabase class /////
    public scholarshipDatabase(ArrayList <scholarship> database){
        this.database = database;
    }
    ///// End Overloaded constructors for the scholarshipDatabase class /////
    
    public void addToDatabase(scholarship newScholarship){ 
        database.add(newScholarship); //This adds a new scholarship to the database
    }

    public void removeFromDatabase(scholarship inputScholarship){ //FIXME: figure out parameters
        for(int i = 0; i < database.size(); i++) { //This loops through the database
            if (database.get(i) == inputScholarship) { //This checks if the scholarship is in the database
                database.remove(i); //This removes the scholarship from the database
            }
        }
    }

    public void editScholarshipInDatabase(scholarship updatedScholarship){ //FIXME: figure our parameters
        //FIXME: need to figure out what to match on to update
    }
}
