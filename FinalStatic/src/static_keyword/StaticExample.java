package static_keyword;

class Counter {
    // Field static, chia sẻ giữa tất cả các đối tượng
    static int count = 0;

    // Phương thức tăng biến đếm
    public void incrementCount() {
        count++; // Tăng biến đếm
    }

    // Phương thức in ra giá trị của count
    public void displayCount() {
        System.out.println("Số lượng đối tượng đã tạo: " + count);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Tạo 3 object(instance) Counter riêng biệt nhưng biến static bị chia sẽ giữa các object
        Counter obj1 = new Counter();
        obj1.incrementCount();
        obj1.displayCount(); // Giá trị 1

        Counter obj2 = new Counter();
        obj2.incrementCount();
        obj2.displayCount();// Giá trị 2


        Counter obj3 = new Counter();
        obj3.incrementCount();
        obj3.displayCount();// Giá trị 3
    }
}
