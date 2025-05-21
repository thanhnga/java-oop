package payment.multiple;

public class CreditCardPayment implements PaymentMethod, ServiceProvider {
    private String cardNumber;

    // Constructor
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean validate() {
        // Giả lập kiểm tra thẻ tín dụng
        return cardNumber.length() == 16;
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public String getProviderName() {
        return "PayPal";// Giả lập tên nhà cung cấp
    }
}
