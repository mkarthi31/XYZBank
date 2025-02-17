public class Auto extends Loan {
    public Auto(String recordID, double interestRate, double amountLeftToPay, int termLeft) {
        super(recordID, "Auto", interestRate, amountLeftToPay, termLeft);
    }
}