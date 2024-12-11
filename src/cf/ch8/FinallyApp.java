package cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        try {
            System.out.println("Please insert a num");
            num = in.nextInt();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(in != null) in.close();//Τα resources πρέπει να κλείνουν. Π.χ scanners, database connections κοκ
                //Αλλά και πάλι πρέπει να ελέγξω το ενδεχόμενο να έχω τιμή null. Οπότε βάζω επιπλέον exception.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//main

}//class
