package cf.ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CharEntryApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';
        //Η next Line επιστρέφει τη γραμμή μέχρι το \n
        //Η charAt(0) επιστρέφει τον πρώτο char ως UTF-16
        inputChar = in.nextLine().charAt(3);
        System.out.println("Input char: "+inputChar);
    }
}//class
