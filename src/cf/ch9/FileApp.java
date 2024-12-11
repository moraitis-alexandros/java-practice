package cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {

        File fd = new File("C:/temp/file7.txt"); //fd: file descriptor
        //H Java το κάνει αυτόματα C:\tmp\file7.txt
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+"); //παρατηρώ ότι βάζει απευθείας το αποτέλεσμα
                //κάθε split στην αντίστοιχη θέση του πίνακα

                for (String token : tokens) {
                    System.out.print(token + " ");
                }
                System.out.println();//Αποδίδω την αλλαγή γραμμής
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }//main
}//class
