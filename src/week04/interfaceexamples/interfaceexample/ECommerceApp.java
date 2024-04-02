package week04.interfaceexamples.interfaceexample;

public class ECommerceApp {

    public static void main(String[] args) {
        PaymentMethod creditPayment = new CrediCardPayment("12341234", "1234", "542");
        PaymentMethod payPalPayment = new PayPalPayment("mail@gmail.com");


        double totalPrice=100.50;
        creditPayment.processPayment(totalPrice);
        payPalPayment.processPayment(totalPrice);
        }
}
