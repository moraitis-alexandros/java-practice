package cf.ch6;

/**
 *
 */
public class SwapApp {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        swap(arr);
        printArray(arr);
    }//main

    public static void  swap(int[] arr) {
        if (arr.length != 2) return; //Για να κάνω swap θέλω 2 στοιχεία
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }//swap

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el+" ");
        }
    }//printArray
}//class
