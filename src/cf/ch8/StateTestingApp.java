package cf.ch8;

import java.util.Scanner;

/**
 * State Testing is more lightweight than try - catch!
 */
public class StateTestingApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator");
        while(!in.hasNextInt()) { //Τσεκάρει το επόμενο token χωρίς να καταναλώσει. "κρυφοκοιτάει"
            System.out.println("Input must be int. Please insert numerator");
            in.nextLine(); //Καταναλώνω το token ώστε να πάει στην επόμενη επανάληψη (με
            //λογική ότι είναι λάθος)
        }
        numerator = in.nextInt(); //Τώρα με την λογική ότι έχει περάσει το τεστ, το
        //καταναλώνω κανονικά.

        System.out.println("Please insert denominator");
        while(!in.hasNextInt()) { //StateTest. Δηλαδή τσεκάρει το επόμενο token χωρίς να καταναλώσει. "κρυφοκοιτάει"
            System.out.println("Input must be int. Please insert denominator");
            in.nextLine(); //Καταναλώνω το token ώστε να πάει στην επόμενη επανάληψη (με
            //λογική ότι είναι λάθος)
        }
        denominator = in.nextInt(); //Τώρα με την λογική ότι έχει περάσει το τεστ, το καταναλώνω κανονικά.

        if (denominator == 0) { //State test
            System.out.println("Error. Denominator must not be zero");
            System.exit(1); //means it exit with error
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n ", numerator, denominator, result);




    }//main

}//class
