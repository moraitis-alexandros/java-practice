package cf.ch17.callbacks;

public class Main3 {

    public static void main(String[] args) {

        doPrint(() -> sayHelloCoding());
        doPrint(() -> sayHelloWorld());


    }//main

    public static void doPrint(Printable printable) {
        printable.print();
    }

    public static void sayHelloWorld() {
        System.out.println("hello world");
    }

    public static void sayHelloCoding() {
        System.out.println("hello coding");
    }

}//class