package cf.ch13.exercises.bankApp;

import cf.ch13.exceptions.SsnNotValidException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SsnNotValidException {
        OverdraftAccount overdraftAccount = new OverdraftAccount("22",200);
        overdraftAccount.withdraw(1000,"22");


        ArrayList<String> clients = new ArrayList<>();
        clients.add("34");
        clients.add("45");
        JointAccount jointAccount = new JointAccount(clients,3000);
        jointAccount.withdraw(2000,"34");
    }//main



}//class
