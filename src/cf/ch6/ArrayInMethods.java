package cf.ch6;

/**
 * Demo with arrays in methods
 */
public class ArrayInMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printArray(arr, 0, arr.length - 1);
    }//main


    public static void  printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }//printArray

    /**
     * Overloaded Version of print array. Prints the elements of the array
     * from low to high index.
     * @param arr the input array
     * @param low the start index
     * @param high the end index
     */
    public static void  printArray(int[] arr, int low, int high) {

        //Checks for infeasibility
        if (low < 0 || high > arr.length -1) {
            return; //Είναι σαν το break
        }

        for (int i = low; i <= high; i++ ) {
            System.out.println(arr[i]+ " ");
        }



    }//printArray

}//class
