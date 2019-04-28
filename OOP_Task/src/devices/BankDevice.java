package devices;

import bank.Account;

public interface BankDevice extends Device {
    default boolean pay(Account account, double amount) {
        boolean isOk = false;
        double balance = account.getBalance();
        if (balance - amount > 0) {
            account.setBalance(balance - amount);
            isOk = true;
            System.out.println("Operation completed successfully. ");
        } else {
            System.out.println("Is not enough money on account. Operation rejected!");
        }
        return isOk;
    }
}
