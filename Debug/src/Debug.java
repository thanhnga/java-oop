public class Debug {
    public static void main(String[] args) {
        System.out.println("Chương trình bắt đầu!");

        int a = 10;
        int b = 10;

        // Gọi hàm sum
        int result = sum(a, b);

        // In kết quả
        System.out.println("Tổng của " + a + " và " + b + " là: " + result);
    }

    // Hàm tính tổng hai số
    public static int sum(int x, int y) {
        return x + y;
    }
}
