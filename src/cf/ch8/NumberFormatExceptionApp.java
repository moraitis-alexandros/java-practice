package cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

//        try {
            System.out.println("Please insert an int");
            inputStr = scanner.nextLine();

            //Για να αποφύγω το try - catch μέσα στη main
            if(!isInt(inputStr)) {
                System.out.println("Error in parsing");
                System.exit(1);
            }
            num = Integer.parseInt(inputStr);

            System.out.println(num);
//        } catch (NumberFormatException ex) {
//            System.out.println("Input must be int");
//        }

    }//main

    //Τρόπος για να γλιτώσω το try catch στη main
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}//class
