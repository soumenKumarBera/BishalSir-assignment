package student_soumen_oop_assignment.qs15;

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod paymentMethod;

        paymentMethod  = new CreaditCardPayment();
        paymentMethod.processPayment(5690);

        paymentMethod = new UpiPayment();
        paymentMethod.processPayment(30000);
    }
}
