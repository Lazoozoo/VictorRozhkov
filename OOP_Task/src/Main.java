import bank.Account;
import devices.Atm;
import devices.Infokiosk;
import devices.PaymentTerminal;

public class Main {

    public static void main(String[] args) {
       Atm atmBnb = new Atm(100000);
       Account victor = new Account(4000);
       PaymentTerminal paymentTerminal = new PaymentTerminal();
       Infokiosk infokioskBps = new Infokiosk();

        System.out.println("Example for " + atmBnb);
        System.out.println("Display balance");
        atmBnb.displayBalance(victor);
        System.out.println("Withdraw from ATM 110 $");
        atmBnb.cashIt(victor, 110);
        System.out.println("Display balance");
        atmBnb.displayBalance(victor);

        System.out.println("Example for " + infokioskBps);
        System.out.println("Display balance");
        infokioskBps.displayBalance(victor);
        System.out.println("Deposit 550$ on the card");
        infokioskBps.deposit(victor, 550);
        System.out.println("Display balance");
        infokioskBps.displayBalance(victor);
        System.out.println("Pay for services 356$");
        infokioskBps.pay(victor, 356);
        System.out.println("Display balance");
        infokioskBps.displayBalance(victor);

        System.out.println("Example for " + paymentTerminal);
        System.out.println("Pay for goods 103.5$");
        paymentTerminal.pay(victor, 103.5);
        System.out.println(victor);
    }
}
