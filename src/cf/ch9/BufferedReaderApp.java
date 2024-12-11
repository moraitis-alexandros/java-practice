package cf.ch9;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {
    public static void main(String[] args) {

    StringBuilder sb = new StringBuilder();
    try (BufferedReader bf = new BufferedReader(new FileReader("C:/temp/bf-read.txt"))) {
        String line = "";
        while((line =bf.readLine())!=null) {
            sb.append(line).append("\n"); //Το τελευταίο append("\n") αφορά την προσθήκη γραμμής για να
            //ξεκινήσει η επόμενη προσθήκη από την επόμενη σειρά
    }
    } catch(IOException e) {
        e.printStackTrace();
    }

}//main

}//class
