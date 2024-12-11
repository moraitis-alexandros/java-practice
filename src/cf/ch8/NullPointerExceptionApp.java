package cf.ch8;

public class NullPointerExceptionApp {

    public static void main(String[] args) {
        String s = null;
//Δεν είναι σωστό να το συγκαλύψουμε με try - catch. Πρέπει να το διορθώσουμε! Για αυτό βάζω s!=nulL
// οπότε δεν μπαίνει καθόλου στο s.equals
        if(s !=null && s.equals("Athens")) {
            System.out.println("EQUALS");
        } else {
            System.out.println("NOT EQUALS");
        }
    }//main
}//class
