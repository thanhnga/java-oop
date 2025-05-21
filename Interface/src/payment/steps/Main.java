package payment.steps;

public class Main {
    public static void main(String[] args) {
        // Sử dụng interface Payment để tạo các phương thức thanh toán
        PaymentMethod creditCardPayment = new CreditCardPayment( "1234567812345678");
        creditCardPayment.process(100.0);

        PaymentMethod eWalletPayment = new EWalletPayment("WALLET123");
        eWalletPayment.process(100.0);
    }

}
