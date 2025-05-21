public class Recursion {

    /**
     * Mỗi lần gọi hàm sum đệ quy thứ tự nhận được:
         * 10 + sum(9)
         * 10 + ( 9 + sum(8) )
         * 10 + ( 9 + ( 8 + sum(7) ) )
         * ...
         * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
         * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
     */
    public static int sum(int k) {
        if (k > 0) {
            // gọi đệ quy
            return k + sum(k - 1);
        } else {
            // điều kiện dừng
            return 0;
        }
    }

    public static void main(String[] args) {

        int result = sum(10);
        System.out.println(result);
    }

}