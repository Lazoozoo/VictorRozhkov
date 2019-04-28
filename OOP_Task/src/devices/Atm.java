package devices;

import bank.Account;

public class Atm implements BankDevice {

    private double cashAmount;

    public Atm(double cashAmount) {

        this.cashAmount = cashAmount;
    }


    @Override
    public String toString() {
        return "Atm{" +
                "cashAmount=" + cashAmount +
                '}';
    }

    @Override
    public String getModel() {
        return "Atm1";
    }

    public void displayBalance(Account account) {
        System.out.println(String.format("Balance:%s", account.getBalance()));
    }

    public boolean cashIt(Account account, double amount) {
        boolean isOk = false;
        double balance = account.getBalance();
        if (balance - amount > 0 && cashAmount >= amount) {
            account.setBalance(balance - amount);
            isOk = true;
            System.out.println("Operation completed successfully");
        } else {
            System.out.println("Is not enough money on account or not enough cash at an ATM. Operation rejected!");
        }
            return isOk;
    }

}
