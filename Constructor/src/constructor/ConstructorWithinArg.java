package constructor;

public class ConstructorWithinArg {
        private int length;
        private int width;

        // Constructor có tham số
        public ConstructorWithinArg(int length) {
            this.length = length;
        }

        public ConstructorWithinArg(int length, int width) {
            this.length = length;
            this.width = width;
        }

    // Phương thức tính diện tích
        public int calculateArea() {
            return length * width;
        }

        // Phương thức in thông tin của hình chữ nhật
        public void printInfo() {
            System.out.println("Chiều dài: " + length);
            System.out.println("Chiều rộng: " + width);
            System.out.println("Diện tích: " + calculateArea());
        }

        public static void main(String[] args) {

            // Tạo một đối tượng Rectangle với constructor có tham số
            ConstructorWithinArg rectangleByLength = new ConstructorWithinArg(5);
            // In thông tin của hình chữ nhật
            rectangleByLength.printInfo();

            ConstructorWithinArg rectangle = new ConstructorWithinArg(5, 10);
            // In thông tin của hình chữ nhật
            rectangle.printInfo();
        }

}
