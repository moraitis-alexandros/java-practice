package cf.ch16.default_static;

public class Main {
    public static void main(String[] args) {
        IWelcome.staticMethod();
        CodingWelcome.staticMethod();
        //Οι μεθοδοι ειναι διαφορετικες!

        CodingWelcome codingWelcome = new CodingWelcome();
        codingWelcome.defaultMethod();

    }
}
