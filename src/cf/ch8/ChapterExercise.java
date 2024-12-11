package cf.ch8;

import java.util.Scanner;

import static cf.ch8.SimpleBank.deposit;

public class ChapterExercise {
    static int choice;
    static double balance = 500;
    static double moneyWithdraw = 800;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            printMenu();
            try {
            choice = getChoice();
                switch (choice) {
                    case 1:
                        deposit(50);
                        break;
                    case 2:
                        try {
                            withdraw(moneyWithdraw);
                            System.out.println("Withdraw "+moneyWithdraw);
                        } catch (IllegalArgumentException ex) {
                            System.out.println("Your balance is lower than the amount you wish to withdraw");
                        }
                        break;
                    case 3:
                        System.out.println("Current Balance is: " + balance);
                        break;
                    case 4:
                        System.out.println("Thanks for using the bank");
                        System.exit(0);
                        break;
                }

            } catch (IllegalArgumentException ex) {
                System.out.println("Please insert a valid number");
            }
        }
    }//main

    static void printMenu() {
            System.out.println("---Simple Bank Menu---");
            System.out.println("1.Deposit Money");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Choose an option");
    }//printMenu

    static int getChoice()  {
        while (!scanner.hasNextInt()) {
            System.out.println("Please insert a valid choice between 1-5");
            scanner.nextLine();
        }
        choice = scanner.nextInt();
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
            return choice ;
        } else {
            throw new IllegalArgumentException("No valid choice");
        }
    }//getChoice()

    static void deposit(double amount) {

    }//deposit

    static void withdraw(double amount) {
        try {
            if (amount >= balance) {
                throw new IllegalArgumentException("Not enough Money");
            } else {
                balance -= amount;
            }
        } catch (IllegalArgumentException ex) {
            System.err.println("Error: "+ ex.getMessage());
            throw ex;
        }
    }//withdraw

}//class
