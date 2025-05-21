package payment.multiple;

public class EWalletPayment implements PaymentMethod, ServiceProvider {
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
    public void process(double amount) {
        System.out.println("Processing e-wallet payment of $ " + amount);
    }

    @Override
    public String getProviderName() {
        return "MoMo";// Giả lập tên nhà cung cấp
    }
}
