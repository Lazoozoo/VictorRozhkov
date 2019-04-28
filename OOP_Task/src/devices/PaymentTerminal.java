package devices;


public class PaymentTerminal implements BankDevice {

    @Override
    public String toString() {
        return "PaymentTerminal{}";
    }

    @Override
    public String getModel() {
        return "PT1";
    }
}
