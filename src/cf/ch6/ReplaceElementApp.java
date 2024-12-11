package cf.ch6;

/**
 * Αντικαθιστά ένα στοιχείο του πίνακα με ένα άλλο
 */
public class ReplaceElementApp {
    public static void main(String[] args) {

    }//main

    public static void  replace(int[] arr, int oldVal, int newVal) {
        int positionToUpdate;
        positionToUpdate = getPosition(arr, oldVal);

        if (positionToUpdate == -1) {
            return;
        }

        arr[positionToUpdate] = newVal;

    }//replace

    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }//getPosition



}//class
