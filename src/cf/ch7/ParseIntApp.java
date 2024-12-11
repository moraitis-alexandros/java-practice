package cf.ch7;

import java.util.Scanner;

/**
 * Μετατρέπει ένα String σε ακέραιο
 */

public class ParseIntApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please Insert an Int");
        s = in.nextLine(); // ότι γράφω κονσόλα είναι int

        num = Integer.parseInt(s);
        System.out.println(num);
    }//main
}//class
