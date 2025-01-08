package cf.ch13;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1, "iban1", "Alice", "Wonderland", "5134", 1000.0);

        try {
            account.deposit(900);

            System.out.println("The deposit was successful");
            account.withdraw(500, "5134");
            System.out.println("The withdraw was successful");
            System.out.println(account.getBalance());
            System.out.println(account.accountToString());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//main

}//class
