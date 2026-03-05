package student_soumen_oop_assignment.qs15;

public class UpiPayment implements  PaymentMethod{

    @Override
    public void processPayment(double amount) {
        System.out.println("Ammount: "+ amount+ " Proceced using UPI payment.");
    }
}
