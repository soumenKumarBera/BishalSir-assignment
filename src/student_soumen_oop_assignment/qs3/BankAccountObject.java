package student_soumen_oop_assignment.qs3;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("8145282610", 500);

        bankAccount.displaybalance();
        bankAccount.deposit(500);
        bankAccount.displaybalance();
        bankAccount.withdraw(0);
        bankAccount.displaybalance();

    }
}
