package cf.ch4;

import java.util.Scanner;

/**
 * Demo of surrogate pairs
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F607;//Ακέραιος που εκφράζεται στο δεκαεξαδικό για πιο σύντομα
        System.out.println(codePoint);
        System.out.println("Smile: \uD83D\uDE07");
        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}//class


