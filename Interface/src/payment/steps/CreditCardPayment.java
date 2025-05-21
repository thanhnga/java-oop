package payment.steps;

public class CreditCardPayment implements PaymentMethod {
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
    public void executeTransaction(double totalAmount) {
        // Logic xử lý giao dịch thực tế
        PaymentMethod.log("Credit card charged: $" + totalAmount);
    }
}
