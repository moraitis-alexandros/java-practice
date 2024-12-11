package cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionApp {

    public static void main(String[] args)  {
        try {
            getMultipleApp();
        } catch (Exception ex) {
            System.out.println("Error");
        }

    }//main

    static void getMultipleApp() throws IOException, InputMismatchException {
        File file = new File("C:/tmp/file.txt");

        try (Scanner scanner = new Scanner(file)) {
            char ch = (char)System.in.read(); //Διαβάζει από κονσόλα έναν χαρακτήρα one byte at a time
            int num = scanner.nextInt();//Διαβάζει από αρχείο
        } catch (FileNotFoundException | InputMismatchException e) {//Αφορά λάθη στο διάβασμα ή
            //λάθη στα στοιχεία που καταχωρούνται InputMismatchException
            System.err.println("File not Found or Input Mismatch"+e.getMessage());
            e.printStackTrace();
            throw e;
//            throw e; //Δεν έχει νόημα γιατί είμαι στη main
        } catch (IOException e) {//can occur when there's a failure or interruption during an I/O operation.
            //αφορά το: char ch = (char)System.in.read(); και τυχόν πρόβλημα με το input stream
            System.err.println("IO Exception"+e.getMessage());
            throw e;
//            throw e; //Δεν έχει νόημα γιατί είμαι στη main
        } catch (Exception e) {
            System.err.println("Generic Error"+e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
}//class
