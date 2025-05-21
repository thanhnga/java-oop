package payment.steps;

public interface PaymentMethod {
    double FEE_RATE = 0.02; // Tỉ lệ phí mặc định 2%

    /**
     * phương thức tiện ích static
     */
    static void log(String message) {
        System.out.println(message);
    }

    /**
     * kiểm tra tính hợp lệ của giao dịch
     */
    boolean validate();

    /**
     * Xử lý thanh toán. Lớp con chỉ cần gọi phương thức này, không cần lo logic tính toán.
     * các bước thanh toán bao gồm:
     * 1. kiểm tra tính hợp lệ
     * 2. tính phí giao dịch
     * 3. thanh toán
     */
    default void process(double amount) {
        if (!validate()) {
            log("Payment validation failed!");
        }

        double fee = calculateFee(amount);
        double totalAmount = amount + fee;

        log("Base amount: $" + amount);
        log("Transaction fee: $" + fee);
        log("Total amount to be processed: $" + totalAmount);

        // Gọi phương thức xử lý cụ thể của lớp con
        executeTransaction(totalAmount);
    }

    /**
     * Tính phí giao dịch.
     */
    default double calculateFee(double amount) {
        return amount * FEE_RATE;
    }

    /**
     * Thực hiện giao dịch với tổng số tiền (bao gồm cả phí).
     * Lớp con chỉ cần tập trung vào logic xử lý tiền, không cần lo tính phí.
     */
    void executeTransaction(double totalAmount);
}
