package cf.ch17.callbacks;

public class Main2 {

    public static void main(String[] args) {

        doPrint(() -> System.out.println("Koukou") );

    }//main

    public static void doPrint(Printable printable) {
        printable.print();
    }
}//class
