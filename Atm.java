import java.util.Scanner;

class Account {
    protected String name;
    protected int pin;
    protected int balance;

    public Account(String name, int pin, int balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }

    public void displayBalance() {
        System.out.println("Your current balance is " + balance);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Successfully credited");
    }

    public boolean withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return false;
        }
        balance -= amount;
        System.out.println("Successfully withdrawn");
        return true;
    }

    public void calculateLoanPayment(double loanAmount, double interestRate, int timePeriod) {
        double monthlyInterestRate = interestRate / 12 / 100;
        int totalPayments = timePeriod * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -totalPayments));
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + (monthlyPayment * totalPayments));
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(String name, int pin, int balance) {
        super(name, pin, balance);
    }

    public void displayReceipt(int deposit, int withdrawal) {
        System.out.println("Available balance: " + balance);
        System.out.println("Amount deposited: " + deposit);
        System.out.println("Amount withdrawn: " + withdrawal);
        System.out.println("Thanks for using our ATM");
    }

    public void calculateLoanPayment(double loanAmount, double interestRate, int timePeriod) {
        super.calculateLoanPayment(loanAmount, interestRate, timePeriod);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String name, int pin, int balance) {
        super(name, pin, balance);
    }

    public void displayReceipt(int deposit, int withdrawal) {
        System.out.println("Available balance: " + balance);
        System.out.println("Amount deposited: " + deposit);
        System.out.println("Amount withdrawn: " + withdrawal);
        System.out.println("Thanks for using our ATM");
    }

    public void calculateLoanPayment(double loanAmount, double interestRate, int timePeriod) {
        super.calculateLoanPayment(loanAmount, interestRate, timePeriod);
    }
}

public class Atm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to our ATM!");
        System.out.println("Please enter your name:");
        String name = s.nextLine();
        System.out.println("Please enter your PIN:");
        int pin = s.nextInt();

        Account account = new CheckingAccount(name, 1234, 10000);

        while (true) {
            if (account.validatePin(pin)) {
                System.out.println("Welcome, " + account.name + "!");

                System.out.println("1. Check balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Calculate Loan Payment");
                System.out.println("5. View receipt");
                System.out.println("6. Exit");

                int choice = s.nextInt();
                int amount;

                switch (choice) {
                    case 1:
                        account.displayBalance();
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit:");
                        amount = s.nextInt();
                        account.deposit(amount);
                        break;
                    case 3:
                        System.out.println("Enter amount to withdraw:");
                        amount = s.nextInt();
                        if (account.withdraw(amount)) {
                            System.out.println("Transaction successful");
                        } else {
                            System.out.println("Transaction failed");
                        }
                        break;
                    case 4:
                        System.out.println("Enter loan amount:");
                        double loanAmount = s.nextDouble();
                        System.out.println("Enter interest rate (%):");
                        double interestRate = s.nextDouble();
                        System.out.println("Enter time period (years):");
                        int timePeriod = s.nextInt();
                        account.calculateLoanPayment(loanAmount, interestRate, timePeriod);
                        break;
                    case 5:
			System.out.println("Hi "+name);
                        CheckingAccount checkingAccount = (CheckingAccount) account;
                        checkingAccount.displayReceipt(0, 0);
                        break;
                    case 6:
                        System.out.println("Thank you for using our ATM");
                        s.close();
                        return;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } else {
                System.out.println("wrong password");
                break;
            }
        }
    }
}
