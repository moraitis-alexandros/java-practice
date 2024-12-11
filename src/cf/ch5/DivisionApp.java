package cf.ch5;

/**
 * Double Demo
 */
public class DivisionApp {
    public static void main(String[] args) {
        double num1 = 8.5;
        double num2 = 3.1;
        double div = 0d;
        double mod = 0.0;
        float myfloat = 4.5f; //Επειδή ο myfloat είναι double απαιτείται να γίνει typecast
        //το typecast το κάνω με το f

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Div: %.2f\n", div);
        System.out.printf("Mod: %5.2f\n", mod);
        System.out.printf("Mod: %5.3f\n", div);
    }
}
