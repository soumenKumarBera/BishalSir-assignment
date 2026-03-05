package student_soumen_oop_assignment.qs15;

public class CreaditCardPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Ammount: "+ amount+ " Proceced using Creadit Card payment.");
    }
}
