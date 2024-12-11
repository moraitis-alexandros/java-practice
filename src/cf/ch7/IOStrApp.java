package cf.ch7;

import java.util.Scanner;

public class IOStrApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s1 = "";
        String s2 = "";

        System.out.println("Give two strings");

        s1 = in.next(); //μέχρι να βρει white space δηλ (spaces, tab, ή new line)
        s2 = in.nextLine(); //μέχρι να βρει enter (δηλ new line)

        System.out.printf("s1: %s\n",s1);
        System.out.printf("s2: %s\n",s2);
    }//main
}//class
