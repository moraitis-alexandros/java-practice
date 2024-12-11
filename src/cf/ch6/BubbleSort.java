package cf.ch6;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 2};
        int[] sorted = bubbleSort(arr);
        for (int el : sorted) {
            System.out.println(el);
        }
    }//main

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }// Η εσωτερική for βρίσκει το μεγαλύτερο και το κάνει swap με τον από
                //κάτω του
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}//class
