package cf.ch6;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give 6 integers from 1 to 49");
        int[] arr = new int[6];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array has more than 3 even: "+ hasMoreThanThreeEven(arr));
        System.out.println("The array has more than 3 odds: "+ hasMoreThanThreeOdds(arr));
        System.out.println("The array has more than 3 consecutive: "+ hasMoreThanThreeConsecutive(arr));
        System.out.println("The array has more than 3 with the same ending: "+ hasMoreThanThreeWithTheSameEnding(arr));
        System.out.println("The array has more than 3 in the same tenth: "+ hasMoreThanThreeInTheSameTen(arr));

    }//main

    static boolean hasMoreThanThreeEven(int[] arr) {
        int countEven = 0;
        for (int el : arr) {
            if (el % 2 == 0) {
                countEven++;
            }
        }
        return (countEven > 3);
    }//hasMoreThan3Even

    static boolean hasMoreThanThreeOdds(int[] arr) {
        int countOdds = 0;
        for (int el : arr) {
            if (el % 2 != 0) {
                countOdds++;
            }
        }
        return (countOdds > 3);
    }//hasMoreThan3Even

    static boolean hasMoreThanThreeConsecutive(int[] arr) {
        boolean countConsecutives = false;
        for (int i = 0; i < arr.length -2; i++) {
            if ((arr[i] == arr[i + 1]) && (arr[i] == arr[i + 2])) {
                countConsecutives = true;
                break;
            }
        }
        return countConsecutives;
    }//hasMoreThanThreeConsecutive

    static boolean hasMoreThanThreeWithTheSameEnding(int[] arr) {
        int[] endings = new int[10]; //One slot for each ending number from 0 to 9
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10] ++;
        }

        for (int count : endings) {
            if (count>3) isSameEnding = true;
        }
        return isSameEnding;
    }//hasMoreThanThreeWithTheSameEnding

    static boolean hasMoreThanThreeInTheSameTen(int[] arr) {
        int count = 0;
        boolean countMoreThanThree = false;
        for (int i= 0; i < arr.length; i++) {
            count = 0;
            //βρίσκω την δεκάδα: την αρχική τιμή και τελική τιμή
            int tenthStart = (arr[i] / 10) * 10;
            int tenthEnding = tenthStart + 9;

            for (int k : arr) {
                if (k >= tenthStart && k <= tenthEnding) {
                    count++;
                }
            }

            if (count>=3) countMoreThanThree = true;
        }
        return countMoreThanThree;
    }//hasmoreThanThreeInTheSameTen

}//class
