package cf.ch6;

public class CircularRotation {

    public static void main(String[] args) {

    }//main

    public static int[] doLeftShift(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i+offset) % arr.length];
            //Το mod καλουπώνει, το βάζει δηλαδή στο 0 length - 1, δεν θα βγει ποτέ εκτός
        }
        return rotated;
    }//doLeftShift

    public static int[] doRightShift(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;


    }
}//class
