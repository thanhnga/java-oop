package isa;

public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng con và gán vào đối tượng cha
        Animal mouse = new Mouse();
        Animal cat = new Cat();

        // Kiểm tra 1 đối tượng được tạo ra là 1 lớp nào đó hay không
        if (mouse instanceof Mouse) {
            System.out.println("animal is a Mouse");
        }

        if (cat instanceof Cat) {
            System.out.println("animal is a Cat");
        }

        // Cách 1: áp dụng kế thừa
        Animal[] animals = {mouse, cat};
        for (Animal animal : animals) {
            // gọi hàm sound() chung mà không quan tâm đến đối tượng thực sự
            // khi chạy run-time chương trình sẽ tự động gọi hàm con tương ứng nếu đã override
            animal.sound();
            if (animal instanceof Mouse) {
                Mouse m = (Mouse) animal;
                // gọi hàm riêng
                m.runAway();
            } else if (animal instanceof Cat) {
                Cat c = (Cat) animal;
                // gọi hàm riêng
                c.scratch();
            }
        }

        //Cách 2: Không áp dụng kế thừa
        // sử dụng đối tượng Object tổng quát
        Object[] objects = {mouse, cat};
        for (Object object : objects) {
            if (object instanceof Mouse) {
                Mouse m = (Mouse) object;
                // gọi hàm chung soun() nhưng phải biết đối tượng thực sự
                m.sound();
                m.runAway();
            } else if (object instanceof Cat) {
                Cat c = (Cat) object;
                // gọi hàm chung soun() nhưng phải biết đối tượng thực sự
                c.sound();
                c.scratch();
            }
        }
    }
}
