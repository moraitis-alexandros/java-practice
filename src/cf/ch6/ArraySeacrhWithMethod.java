package cf.ch6;

/**
 * cf.ch6.ArraySearch με μέθοδο
 */
public class ArraySeacrhWithMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int value = 12;
        int position = getPosition(arr, value);

        if (position == -1){
            System.out.println("Not Found");
        } else {
            System.out.printf("Value: %d, Position %d", arr[position], (position+1));
        }


    }//main

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
