package cf.ch6;

/**
 * Finds the min and max of an array
 */
public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 10};
        getMinPosition(arr);

    }//main

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPostion = 0;
        int minValue = arr[minPostion];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPostion = i;
                minValue = arr[i];
            }
        }
        return minPostion;
    }

        public static int getMaxPosition(int[] arr) {
            if (arr==null || arr.length < 1) return -1;

            int maxPosition = 0;
            int maxValue = arr[maxPosition];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxValue) {
                    maxPosition = i;
                    maxValue = arr[i];
                }
            }
            return maxPosition;

        }//getMaxPosition

}//class
