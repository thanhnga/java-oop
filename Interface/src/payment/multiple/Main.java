package payment.multiple;

public class Main {
    public static void main(String[] args) {
        // Sử dụng interface Payment để tạo các phương thức thanh toán
        PaymentMethod creditCardPayment = new CreditCardPayment( "1234567812345678");
        if (creditCardPayment.validate()){
            creditCardPayment.process(100.0);
            System.out.println("Provider Info: " + ((CreditCardPayment) creditCardPayment).getProviderName());
        }

        PaymentMethod eWalletPayment = new EWalletPayment("WALLET123");
        if (eWalletPayment.validate()){
            eWalletPayment.process(100.0);
            System.out.println("Provider Info: " + ((EWalletPayment) eWalletPayment).getProviderName());
        }
    }

}
