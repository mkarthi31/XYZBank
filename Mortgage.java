public class Mortgage extends Loan {
    private double overpaymentOption;

    public Mortgage(String recordID, double interestRate, double amountLeftToPay, int termLeft, double overpaymentOption) {
        super(recordID, "Mortgage", interestRate, amountLeftToPay, termLeft);
        this.overpaymentOption = overpaymentOption;
    }

    public double getOverpaymentOption() {
        return overpaymentOption;
    }

    public void setOverpaymentOption(double overpaymentOption) {
        this.overpaymentOption = overpaymentOption;
    }
}