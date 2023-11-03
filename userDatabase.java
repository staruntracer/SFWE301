import java.util.ArrayList;
public class userDatabase {
    private ArrayList <user> database = new ArrayList<>(); //This is our arraylist mock database

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
