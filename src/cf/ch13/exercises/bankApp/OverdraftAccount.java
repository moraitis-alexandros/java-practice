package cf.ch13.exercises.bankApp;

import cf.ch13.Account;
import cf.ch13.exceptions.SsnNotValidException;

public class OverdraftAccount {

    private String ssn;
    private double balance;
    private double dept;

    public OverdraftAccount() {

    }//default constructor

    public OverdraftAccount(String ssn, double balance) {
        this.ssn = ssn;
        this.balance = balance;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Public API
     */

    /**
     * Withdraws an amount of money from the {@link Account}
     * based on a valid ssn check by {@link #isSsnValid(String)}
     * It allow overdraft.
     *
     * @param amount
     *          the amount to be withdrawn
     * @param ssn
     *          the given ssn
     * @throws Exception
     *
     *          if the ssn is not valid or the balance is not sufficient or the amount is negative
     */

    public void withdraw(double amount, String ssn) throws SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }

            balance -= amount;
            System.out.println("Amount " + amount + " successfully withdrawn");
            System.out.println("Current balance "+balance);

        } catch (SsnNotValidException e) {
            System.err.println("Error " + e.getMessage());

            throw e;
        }
    }//withdraw

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }//isSsnValid
}//class
