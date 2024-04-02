package week04.interfaceexamples.interfaceexample;

public class CrediCardPayment implements PaymentMethod {

    private String cardnumber;
    private String expiryDate;

    private String cvc;


    public CrediCardPayment(String cardnumber, String expiryDate, String cvc) {
        this.cardnumber = cardnumber;
        this.expiryDate = expiryDate;
        this.cvc = cvc;
    }
        @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment processedfor amount:"+ amount);



    }
}
