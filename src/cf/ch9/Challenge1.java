package cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Challenge1 {

    public static void main(String[] args) {
    String line;
    String[] tokens;

        try (
        BufferedReader br = new BufferedReader(new FileReader("C:/temp/locations.txt"));
        PrintStream ps = new PrintStream("C:/temp/locations-new.txt")
        ) {

            while ((line = br.readLine()) != null) {
                if (!line.matches("Location,Latitude,Longitude")) {
                    tokens = line.split(",+\\s*");
                    printFormatted(ps, tokens);
                }//if
            }//while

        } catch (IOException e) {
            System.err.println("An error found! Check the file input!");
        }
    }//main


    public static void  printFormatted(PrintStream ps, String[] tokens) {
//    public static void  printFormatted(PrintWriter ps, String[] tokens) { //σε περίπτωση που χρησιμοποιήσω printFormatted
        ps.printf("{ \"Location\":  \"%s\", \"Latitude\": \"%s\", \"Longitude\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);
    }
}//class
