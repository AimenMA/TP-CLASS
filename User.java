public class User {
    private String username;
    private String email;

public User(String username, String email){
    this.username= username;
    this.email= email;
}

public String toString(){
    return  "User(Username is '" + username + "' and email is'" + email + "')";
}
}