public abstract class Loan {
    protected String recordID;
    protected String loanType;
    protected double interestRate;
    protected double amountLeftToPay;
    protected int termLeft;

    public Loan(String recordID, String loanType, double interestRate, double amountLeftToPay, int termLeft) {
        this.recordID = recordID;
        this.loanType = loanType;
        this.interestRate = interestRate;
        this.amountLeftToPay = amountLeftToPay;
        this.termLeft = termLeft;
    }

    // getters
    public String getRecordID() {
        return recordID;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getAmountLeftToPay() {
        return amountLeftToPay;
    }

    public int getTermLeft() {
        return termLeft;
    }

    // setters
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setAmountLeftToPay(double amountLeftToPay) {
        this.amountLeftToPay = amountLeftToPay;
    }

    public void setTermLeft(int termLeft) {
        this.termLeft = termLeft;
    }
}
