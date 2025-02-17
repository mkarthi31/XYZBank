import java.util.ArrayList;
import java.util.Scanner;

public class XYZBank {
    private ArrayList<Customer> customers;

    public XYZBank() {
        this.customers = new ArrayList<>();
    }

    // method to register a new customer
    public void registerCustomer(String customerID, double income) {
        if (isValidCustomerID(customerID)) {
            Customer newCustomer = new Customer(customerID, income);
            this.customers.add(newCustomer);
            System.out.println("Customer registered successfully.");
        } else {
            System.out.println("Invalid Customer ID. It should be in the format ’AAAXXX’, where A denotes a capital letter A,..., Z, and X stays for a digit 0,...,9.");
        }
    }

    // method to update information about existing customers
    public void updateIncome(String customerID, double income) {
        Customer customer = findCustomerByID(customerID);
        if (customer != null) {
            customer.setIncome(income);
            System.out.println("Income updated successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    // method to verify a customer's eligibility
    public boolean verifyEligibility(String customerID) {
        Customer customer = findCustomerByID(customerID);
        if (customer != null) {
            return customer.checkEligibility();
        } else {
            System.out.println("Customer not found.");
            return false;
        }
    }

    // method to print information about a particular user or all users
    public void printCustomerDetails(String customerID) {
        Customer customer = findCustomerByID(customerID);
        if (customer != null) {
            customer.printDetails();
        } else {
            System.out.println("Customer not found.");
        }
    }

    public void printAllCustomers() {
        for (Customer customer : this.customers) {
            customer.printDetails();
        }
    }

    // method to register a credit record for an existing customer
    public void registerCreditRecord(String customerID, String recordID, String loanType, double interestRate, double amountLeftToPay, int termLeft) {
        // Implementation of this method remains unchanged from your original code
        // Please include it as per your requirement
    }

    // method to remove a credit record from a customer
    public void removeCreditRecord(String customerID, String recordID) {
        // Implementation of this method remains unchanged from your original code
        // Please include it as per your requirement
    }

    // helper method to find a customer by ID
    private Customer findCustomerByID(String customerID) {
        for (Customer customer : this.customers) {
            if (customer.getCustomerID().equals(customerID)) {
                return customer;
            }
        }
        return null;
    }

    // method to validate customer ID format
    private boolean isValidCustomerID(String customerID) {
        // Check if the length is exactly 6 characters
        if (customerID.length() != 6)
            return false;

        // Check if first three characters are uppercase letters
        for (int i = 0; i < 3; i++) {
            char c = customerID.charAt(i);
            if (!(c >= 'A' && c <= 'Z'))
                return false;
        }

        // Check if last three characters are digits
        for (int i = 3; i < 6; i++) {
            char c = customerID.charAt(i);
            if (!(c >= '0' && c <= '9'))
                return false;
        }

        return true;
    }
    // main class

    public static void main(String[] args) {
        XYZBank bank = new XYZBank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // print menu options
            System.out.println("1. Register a new XYZ BANK customer");
            System.out.println("2. Update annual income");
            System.out.println("3. Register a loan record");
            System.out.println("4. Print customer details");
            System.out.println("5. Print all customers information");
            System.out.println("6. Remove a loan record");
            System.out.println("7. Exit");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter a Customer ID (in the format ’AAAXXX’):");
                    String customerID = scanner.next();
                    System.out.println("Enter customer's annual income (in thousands of pounds):");
                    double income = scanner.nextDouble();
                    bank.registerCustomer(customerID, income);
                    break;
                case 2:
                    System.out.println("Enter a Customer ID (in the format ’AAAXXX’):");
                    customerID = scanner.next();
                    System.out.println("Enter new income:");
                    income = scanner.nextDouble();
                    bank.updateIncome(customerID, income);
                    break;
                case 3:
                    System.out.println("Enter the Customer ID (in the format ’AAAXXX’):");
                    customerID = scanner.next();
                    System.out.println("Enter a Record ID (in the format ’XXXXXX’):");
                    String recordID = scanner.next();
                    System.out.println("Enter loan type (Auto, Builder, Mortgage, Personal, or Other):");
                    String loanType = scanner.next();
                    System.out.println("Enter interest rate for the loan:");
                    double interestRate = scanner.nextDouble();
                    System.out.println("Enter the loan amount left to pay (in thousands pounds):");
                    double amountLeftToPay = scanner.nextDouble();
                    System.out.println("Enter the loan term left (in years):");
                    int termLeft = scanner.nextInt();
                    bank.registerCreditRecord(customerID, recordID, loanType, interestRate, amountLeftToPay, termLeft);
                    break;
                case 4:
                    System.out.println("Enter the Customer ID (in the format ’AAAXXX’):");
                    customerID = scanner.next();
                    bank.printCustomerDetails(customerID);
                    break;
                case 5:
                    bank.printAllCustomers();
                    break;
                case 6:
                    System.out.println("Enter the Customer ID (in the format ’AAAXXX’):");
                    customerID = scanner.next();
                    System.out.println("Enter the Record ID (in the format ’XXXXXX’):");
                    recordID = scanner.next();
                    bank.removeCreditRecord(customerID, recordID);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("You entered an invalid option. Please select a valid option from the menu below.");
            }
        }
    }
}
