package cf.ch8;

public class Arithmetic2 {

    public static void main(String[] args) {
try {
    int num1 = 10;
    int num2 = 0;
    int result = 0;

    result = num1 / num2;
} catch (ArithmeticException e) {
    e.printStackTrace();
    System.err.println(e.getMessage());
}
        System.out.println("This line will be executed");
    }//main
}//class
