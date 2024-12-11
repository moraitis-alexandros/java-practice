package cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

public class Challenge2 {
    static String folderPath = "C:\\temp\\challenge2\\"; // inPath is the same with outPath
    static String userInputPath;
    static String absoluteOldFilePath;
    static String absoluteNewFilePath;
    static String fileExtension;

    public static void main(String[] args) {
        getAbsoluteOldFilePath();
        getAbsoluteNewFilePath();
     try {
         copyFile();
         showResultsReport();
     } catch (IOException ex) {
         System.out.println("An Error Occurred.");
     }

    }//main

    private static void showResultsReport() {
        System.out.println("The file copied successfully");
        System.out.println("----Windows Format---");
        System.out.println("The absolute path of the original file is: "+absoluteOldFilePath);
        System.out.println("The absolute path of the copied file is: "+absoluteNewFilePath);
        System.out.println("----Linux/MacOS Format---");
        System.out.println("The absolute path of the original file is: "+"/home/"+absoluteOldFilePath.substring(3).replace("\\","/"));
        System.out.println("The absolute path of the copied file is: "+"/home/"+absoluteNewFilePath.substring(3).replace("\\","/"));
        getFileExtension();
        System.out.println("The file extension is: "+fileExtension);
    }//showResultsReport

    public static void getFileExtension() {
        int dotIndex = absoluteNewFilePath.lastIndexOf(".");

        if (dotIndex >= 0) {
            fileExtension = absoluteNewFilePath.substring(dotIndex+1);
        }
    }//getFileExtension

    public static void getAbsoluteNewFilePath() {
        absoluteNewFilePath = folderPath +
                UUID.randomUUID().toString().replace(":","_")
                + userInputPath;
    }//produceNewFilePath

    public static void readPath() {
        System.out.println("Please give the name of the file along with its extension");
        Scanner in = new Scanner(System.in);
        userInputPath = in.nextLine();
    }//readPath

    public static void getAbsoluteOldFilePath()  {
        readPath();
        absoluteOldFilePath = folderPath + userInputPath;
    }//getFullFilePath

    public static void copyFile() throws IOException{
        int b;
        byte[] buffer = new byte[8192];

        try (FileInputStream fis = new FileInputStream(absoluteOldFilePath);
             FileOutputStream fos = new FileOutputStream(absoluteNewFilePath)) {
            while ((b = fis.read(buffer)) != -1) {
                fos.write(buffer,0,b);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }//copyfile

}//class
