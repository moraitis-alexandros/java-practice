package cf.ch14.model;

public class Main {

    public static void main(String[] args) {
        User user = new User(1L, "Nikos", "Koukos");
        UserCredentials userCredentials = new UserCredentials(1L, "Alice", "WWW");

        System.out.println("{"+user.getId() + ", " + user.getFirstname() + ", " +  user.getLastname() + "}");
        System.out.println("{"+userCredentials.getId() + ", " + userCredentials.getUsername() + ", " +  userCredentials.getPassword() + "}");


    }//main


}//class
