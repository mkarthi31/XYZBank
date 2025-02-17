public class Builder extends Loan {
    private double overpaymentOption;

    public Builder(String recordID, double interestRate, double amountLeftToPay, int termLeft, double overpaymentOption) {
        super(recordID, "Builder", interestRate, amountLeftToPay, termLeft);
        this.overpaymentOption = overpaymentOption;
    }

    public double getOverpaymentOption() {
        return overpaymentOption;
    }

    public void setOverpaymentOption(double overpaymentOption) {
        this.overpaymentOption = overpaymentOption;
    }
}
