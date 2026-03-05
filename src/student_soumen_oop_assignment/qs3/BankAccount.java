package student_soumen_oop_assignment.qs3;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(double balance){
        if (balance > 0){
            this.balance += balance;
            System.out.println("Successfully Deposit...!");

        }else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount){

        if (amount > 0 && amount <= this.balance){
            this.balance -= amount;

            System.out.println("Successfully Withdraw.");

        }else {

            System.out.println("Insufficient Balance.....! Plese check Balance and try ");
        }


    }

    public void displaybalance(){
        System.out.println("AccountNumber => " + this.accountNumber);
        System.out.println("Balance => " + this.balance);

    }



}
