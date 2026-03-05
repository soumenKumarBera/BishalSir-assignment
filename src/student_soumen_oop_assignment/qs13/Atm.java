package student_soumen_oop_assignment.qs13;

public class Atm {

    private double balance;

    public Atm( double balance) {

        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit: ₹" + amount);

        }else {
            System.out.println("Deposit amount must be positive.");
        }


    }

    public void withdraw(double amount){

        if (amount <= 0){

            System.out.println("Withdraw amount must be positive.");
        }else if (amount > this.balance){
            System.out.println("Insufficient balance. Available balance: ₹" + this.balance);
        }else {
            this.balance -= amount;

            System.out.println("Withdraw: ₹" + amount);
        }


    }

    public void balance(){

        System.out.println("Current Balance: ₹ " + balance);
    }






}
