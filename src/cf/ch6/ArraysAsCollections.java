package cf.ch6;

public class ArraysAsCollections {


    public static void main(String[] args) {
        int[] arr = {8, 22, 23, 24, 22};
        int[] evenArray = getEvens(arr);
        int[] doubleArray = mapToDouble(arr);

        for (int j : evenArray) {
            System.out.println(j);
        }
        for (int j : doubleArray) {
            System.out.println(j);
        }

        System.out.println(sum(arr));
        System.out.println(average(arr));

        System.out.println(anyEven(arr));
        System.out.println(moreThatTwoWithSameEnding(arr));
        System.out.println(allAreEven(arr));
        System.out.println(moreThatTwoEvens(arr));
        System.out.println(moreThatThreeConsecutive(arr));
    }//main

    //Filtering
    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int [] evens = new int[count];

        int pivot = 0;
        for (int el : arr) {
            if (el % 2 == 0) evens[pivot++] = el;
            }
        return evens;
    }//getEvens

    //Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] doubleArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubleArray[i] = arr[i]*2;
        }
        return doubleArray;
    }

    //Reducing
    public static int sum(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return sum / (double)arr.length;
    }

    public static boolean anyEven(int[] arr) {
        boolean isAnyEven = false;
        for (int el : arr) {
            if (el % 2 == 0) {
                isAnyEven = true ;
            break;
            }
        }
        return isAnyEven;
    }

    public static boolean moreThatTwoEvens(int[] arr) {
        int evenCcount = 0;
        for (int el : arr) {
            if (el % 2 == 0) evenCcount++ ;
        }
     return evenCcount > 2;
    }

    public static boolean moreThatThreeConsecutive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] -1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThatTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10]; //One slot for each ending number from 0 to 9
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10] ++;
        }

        for (int count : endings) {
            if (count>=3) isSameEnding = true;
        }

        return isSameEnding;
    }

    public static boolean allAreEven(int[] arr) {


        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        return count == arr.length;
    }

}//class




