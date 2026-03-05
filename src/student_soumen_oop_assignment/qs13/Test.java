package student_soumen_oop_assignment.qs13;

public class Test {
    public static void main(String[] args) {
        Atm atm = new Atm(1000);

        atm.deposit(500);
        atm.balance();

        atm.withdraw(0);

        atm.withdraw(2000);

        atm.withdraw(1000);

        atm.balance();




    }
}
