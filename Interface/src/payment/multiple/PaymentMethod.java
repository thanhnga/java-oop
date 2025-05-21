package payment.multiple;

public interface PaymentMethod {
    boolean validate(); // Kiểm tra thông tin thanh toán
    void process(double amount); // Thực hiện thanh toán
}
