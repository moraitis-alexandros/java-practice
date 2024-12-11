package cf.ch6;

import java.security.spec.RSAOtherPrimeInfo;

public class Challenge_5 {

    public static void main(String[] args) {
        int[][] arr= {{1412, 1436}, {1317, 1417}, {1414, 1820}};
        int[][] sortedTransformedArr = sortedTranformedArr(arr);
        printArr(sortedTransformedArr);
        System.out.println("Number of Duplicates: "+findDuplicates(sortedTransformedArr));
    }//main

    static int findDuplicates(int[][] arr) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] == 1) {
                count++;
            }

            if (arr[i][1] == 0) {
                if (count > maxCount) {
                    maxCount = count;
                    count = 0;
                }
            }
        }
        if (maxCount == 1) maxCount = 0;
        return maxCount;
    }//findDuplicates

    static int[][] sortedTranformedArr(int[][] arr) {
        int[][] transformedArr = transformedArr(arr);
        return bubbleSort(transformedArr);
    }//sortedTranformedArr

    static int[][] bubbleSort(int[][] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    swap(arr, j, j + 1);
                }// Η εσωτερική for βρίσκει το μεγαλύτερο και το κάνει swap με τον από
                //κάτω του
            }
        }
        return arr;
    }//bubbleSort

    static void swap(int[][] arr, int i, int j) {
        int tmp1 = arr[i][0];
        int tmp2 = arr[i][1];
        arr[i][0] = arr[j][0];
        arr[i][1] = arr[j][1];
        arr[j][0] = tmp1;
        arr[j][1] = tmp2;
    }//swap

    static void printArr(int[][] arr) {
        for (int[] el : arr) {
            for(int dm : el) {
                System.out.print(dm+" ");
            }
            System.out.println();
        }
    }//printArr

    static int[][] transformedArr(int[][] arr) {
        int[][] helpArr = new int[arr.length * 2][2];
        int k = 0;
        do {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    helpArr[k][0] = arr[i][j];
                    if (j == 0) {
                        helpArr[k][1] = 1;
                    } else {
                        helpArr[k][1] = 0;
                    }
                    k++;
                }
            }
        } while (k < helpArr.length);
        return helpArr;
    }//transformedArr


}//class
