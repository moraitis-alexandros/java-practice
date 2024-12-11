package cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {
    public static void main(String[] args) {


        int num = 0;

        try (Scanner in = new Scanner(System.in)) { //Κλείνει αυτόματα τον scanner, δηλ κάνει αυτόματα το close.
            //Ονομάζεται try with resources. Σε αντίθεση με FinallyApp
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }//main
}//class
