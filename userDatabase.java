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

    public void removeFromDatabase(user inputUser){ //FIXME: figure out parameters
        for (int i = 0; i < database.size(); i++) { //This loops through the database
            if (database.get(i) == inputUser) { //This checks if the user is in the database
                database.remove(i); //This removes the user from the database
            }
        }
    }

    public void editUserInDatabase(user NewUserInfo){ //FIXME: figure our parameters (maybe delete user and add in new one with new info??)
        user updatedUser = NewUserInfo; //This is the user to edit
        for(int i = 0; i < database.size(); i++) { //This loops through the database
            //We will need to determine what to match on and then just the set method to update the user info
        }


            // if (database.get(i) == NewUserInfo.get) { //This checks if the user is in the database
            //     user userToEdit = database.get(i); //This gets the user to edit
            //     return userToEdit; //This returns the user to edit
            // }
    }

    public user searchByName(String inputUser){
        for(int i = 0; i < database.size(); i++) { //This loops through the database
            if (database.get(i).getName() == inputUser) { //This checks if the user is in the database
                return database.get(i); //This returns the user
            }
        }
        return null; //This returns null if the user is not found
    }
    
}
