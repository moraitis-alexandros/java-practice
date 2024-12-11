package cf.ch2;

import java.util.Scanner;

public class HowToPrintf {
    public static void main(String[] args) {
        int num1 = 99999;

        System.out.printf("The number is: %d %n",num1);
        System.out.printf("The number is: %6d %n",num1);
        System.out.printf("The number is: %06d %n",num1);
        System.out.printf("The number is: %,06d %n",num1); //ένα ψηφίο κρατάει ο διαχωριστής χιλιάδων
        System.out.printf("The number is: %,07d %n",num1);

        int i = 1;
        int result = 1;
        boolean found = false;
        do {    result = result + i;
            if (result == 7) {
                found = true;
            }    i++;
        } while ((i >= 1) && (! found));
        System.out.println(i);
    }
}
