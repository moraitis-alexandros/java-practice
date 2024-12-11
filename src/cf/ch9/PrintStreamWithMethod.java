package cf.ch9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("C:/temp/file-7-printstream.txt", StandardCharsets.UTF_8)){
//        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/temp/file-7-ps.txt", true))){

            FileOutputStream outps = new FileOutputStream("C:/temp/file-7-ps.txt", true);
            printMessage(ps,"Hello coding Factory");
            printMessage(System.out, "Hello CF"); //Τυπώνει στην κονσόλα
        } catch (IOException e) {

        }


    }//main

    /**
     * Generic PrintStream Method
     * @param ps
     * @param message
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }//printMessage

}//class
