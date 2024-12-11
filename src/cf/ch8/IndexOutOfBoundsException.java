package cf.ch8;

public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] arr = new int[10];
//Δεν είναι σωστό να το συγκαλύψουμε με try - catch. Πρέπει να το διορθώσουμε!
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }//main
}//class
