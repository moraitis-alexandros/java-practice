package cf.ch6;

public class Challenge_4 {

    public static void main(String[] args) {
        int position = 4;
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        System.out.println(getLowAndHighIndexOf(arr,position)[0]);
        System.out.println(getLowAndHighIndexOf(arr,position)[1]);
    }//main
    static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] returnTable = new int[2];
        int lowIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lowIndex = i;
                System.out.println("Low is "+lowIndex);
            break;
        }
        }
        int highIndex = lowIndex;

        for (int i = lowIndex; i < arr.length -1; i++) {
            if(arr[highIndex + 1] == key){
                highIndex++;
                System.out.println("High is "+highIndex);
            }
        }
            returnTable[0] = lowIndex;
            returnTable[1] = highIndex ;
        return returnTable;
    }
}//class
