package cf.ch7;

import java.security.SecureRandom;

public class IndexOfSubStringApp {

    public static void main(String[] args) {

        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); //1
        int positionOfSecondo = cf.indexOf("o", 2);
        int lastPositionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(0); // επιστρέφει όλο το cf
        String slice = cf.substring(1,3); //od

        System.out.println(slice);

    }//main
}//class
