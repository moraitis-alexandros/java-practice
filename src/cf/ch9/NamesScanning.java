package cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει από ένα αρχείο δεδομένα και θέλω να τα μετατρέψω σε json
 */

public class NamesScanning {
    public static void main(String[] args) {
        String inFilePath = "C:/temp/names.txt";
        String outFilePath = "C:/temp/namesFormatted.txt";
        String line;
        String[] tokens;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inFilePath))){
            PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8);
//            PrintWriter ps = new PrintWriter(outFilePath); //αντίστοιχα πρέπει να
            //κάνω τις μετατροπές στη συνάρτηση printFormatted

            while ((line = bufferedReader.readLine()) != null) { //Όσο το input έχει κάτι να διαβάζει
                tokens = line.split(",+\\s*");
                printFormatted(ps, tokens);
                //Το printFormatted δέχεται αντικείμενο PrintWriter
                //Ωστόσο το System.out είναι Printstream
                //επομένως αυτό που μπορεί να γίνει είναι να εισάγω ένα νέο PrintWriter μέσα
                //στη printFormatted ο οποίος θα εξάγει σε System.out, όπως παρακάτω:
//                printFormatted(new PrintWriter(System.out, true), tokens);
                printFormatted(System.out, tokens);
            }//while
        } catch (IOException e) {
            System.err.println("Error. ");
        }
    }//main

    public static void  printFormatted(PrintStream ps, String[] tokens) {
//    public static void  printFormatted(PrintWriter ps, String[] tokens) { //σε περίπτωση που χρησιμοποιήσω printFormatted
        ps.printf("{ \"Firstname\": } \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0],tokens[1],tokens[2]);
    }
}//class
