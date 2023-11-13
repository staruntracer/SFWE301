import java.util.ArrayList;
public class userDatabase {
    private ArrayList <user> database; //This is our arraylist mock database

    public userDatabase(){ //This is the default constructor
        this.database = new ArrayList<>();
    }
    ///// Start Overloaded constructors for the userDatabase class /////
    public userDatabase(ArrayList <user> database){
        this.database = database;
    }
    ///// End Overloaded constructors for the userDatabase class /////
    
    public void addToDatabase(user newUser){ 
        database.add(newUser); //This adds a new scholarship to the database
    }

    public void removeFromDatabase(){ //FIXME: figure out parameters
        //FIXME: figure out search parameters 
    }

    public user editUserInDatabase(){ //FIXME: figure our parameters
        user userToEdit = null; //fixme this is temporary

        return userToEdit; //This returns the updated version of the scholarship
    }
    
}
