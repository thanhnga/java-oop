package payment.steps;

public class EWalletPayment implements PaymentMethod {
    double  WALLET_FEE_RATE = 0.01; // Tỉ lệ phí e-wallet 1%
    private String walletId;

    public EWalletPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public boolean validate() {
        // Giả lập kiểm tra ví điện tử
        return walletId != null && !walletId.isEmpty();
    }

    @Override
    public void executeTransaction(double totalAmount) {
        // Logic xử lý giao dịch thực tế
        PaymentMethod.log("E-wallet charged: $" + totalAmount);
    }

    @Override
    public double calculateFee(double amount) {
        return amount * WALLET_FEE_RATE;
    }
}
