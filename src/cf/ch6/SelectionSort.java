package cf.ch6;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 2, 2};
        int[] sorted = selectionSort(arr);
        for (int el : sorted) {
            System.out.println(el);
        }
    }//main


    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length -1; i++) {
            int minPosition = i;
            int minValue = arr[minPosition];

            //Find Minimum value of unordered subset
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }
            //Make swap
            swap(arr, minPosition, i);
        }
        return arr;

    }//selectionSort

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}//class
