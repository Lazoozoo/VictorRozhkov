package devices;

import bank.Account;

public class Infokiosk implements BankDevice {

    @Override
    public String toString() {
        return "Infokiosk{}";
    }


    @Override
    public String getModel() {
        return "Infokiosk1";
    }

    public void displayBalance(Account account) {
        System.out.println(String.format("Balance:%s", account.getBalance()));
    }

    public boolean deposit(Account account, double amount) {
        boolean isOk = false;
        double balance = account.getBalance();
        if (balance + amount > balance) {
            account.setBalance(balance + amount);
            isOk = true;
            System.out.println("Operation completed successfully. Your account has been deposited " + amount);
        } else {
            System.out.println("Deposit cash in the bill acceptor.");
        }

        return isOk;

        }
}

