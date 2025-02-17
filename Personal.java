public class Personal extends Loan {
    public Personal(String recordID, double interestRate, double amountLeftToPay, int termLeft) {
        super(recordID, "Personal", interestRate, amountLeftToPay, termLeft);
    }
}
