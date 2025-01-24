package cf.ch17.callbacks;

public class Main4 {

    public static void main(String[] args) {

        doPrint(Main4::sayHelloCoding);
        doPrint(Main4::sayHelloWorld);


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