import java.util.ArrayList;

public class Customer implements CheckerPrinter {
    private String customerID;
    private double income;
    private ArrayList<Loan> creditRecords;

    public Customer(String customerID, double income) {
        this.customerID = customerID;
        this.income = income;
        this.creditRecords = new ArrayList<>();
    }

    // getters and setters
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public ArrayList<Loan> getCreditRecords() {
        return creditRecords;
    }

    public void addCreditRecord(Loan loan) {
        this.creditRecords.add(loan);
    }

    // methods from CheckerPrinter interface
    @Override
    public boolean checkEligibility() {
        double totalAmountLeftToPay = 0;
        for (Loan loan : creditRecords) {
            totalAmountLeftToPay += loan.getAmountLeftToPay();
        }
        return totalAmountLeftToPay <= 4 * this.income;
    }

    @Override
    public void printDetails() {
        System.out.println("================================");
        System.out.println("CustomerID " + customerID);
        System.out.println("RecordID LoanType IntRate AmountLeft TimeLeft");
        for (Loan loan : creditRecords) {
            System.out.println(loan.getRecordID() + " " + loan.getLoanType() + " " + loan.getInterestRate() + " " + loan.getAmountLeftToPay() + " " + loan.getTermLeft());
        }
        System.out.println("================================");
    }

}