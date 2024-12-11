package cf.ch8;

import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        try {
//        deposit(100); //με illegalargumentexception ΔΕΝ το κοκκινίζει
            deposit(100); //με exception το κοκκινίζει επειδή είναι checked
            //δηλαδή γυρνάει το exception τη main οπότε βάζω try catch αι στο catch βάζω
            //μήνυμα προς τον χρήστη
        } catch (Exception e) {
            System.out.println("An error happened. Try again...");
        }

    }//main

//    public static void deposit(double amount) throws IllegalArgumentException  { /* Επειδή
//    είναι runtime το illegalargument στην επικεφαλίδα μπορεί να παραληφθεί*/
//        try {
//            if (amount <=0) {
//                throw new IllegalArgumentException("Amount must be positive");
//            }
//            balance += amount;
//            System.out.println("Successfully deposited: "+amount); //σε κάποιο logger
//        } catch (IllegalArgumentException e) {
//        System.err.println("Error "+e.getMessage()); //σε κάποιο logger
//        throw e; //γίνεται rethrow στη main
//        }

        public static void deposit(double amount) throws Exception {
            try {
                if (amount <= 0) {
                    throw new Exception("Amount must be positive");
                }
                balance += amount;
                System.out.println("Successfully deposited: " + amount); //σε κάποιο logger
            } catch (Exception e) {
                System.err.println("Error " + e.getMessage()); //σε κάποιο logger
                throw e; //γίνεται rethrow στη main
            }
        }//deposit

}//class
