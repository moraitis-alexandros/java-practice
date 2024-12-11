package cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:/temp/file7.txt"); //inFd: file descriptor
        //H Java το κάνει αυτόματα C:\tmp\file7.txt
        File outFd = new File("C:/temp/file7-out.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(inFd) ;
            PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)

        ) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+"); //παρατηρώ ότι βάζει απευθείας το αποτέλεσμα
                //κάθε split στην αντίστοιχη θέση του πίνακα

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                    ps.printf("%s ",token);
                    ps.flush();//Κάνει instant write (κάποια δεν κάνουν απευθείας write για λόγους efficiency
                }
                System.out.println();//Αποδίδω την αλλαγή γραμμής
                ps.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//main
}//class
