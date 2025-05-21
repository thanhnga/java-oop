public class ReferenceObjectMain {


    static void changeObject(ReferenceObject object) {
        object.setValue(20); // Thay đổi giá trị của đối tượng thông qua tham chiếu
    }

    static ReferenceObject donotChangeObject(ReferenceObject object){
        return new ReferenceObject(object.getValue());
    }

    public static void main(String[] args) {

        ReferenceObject object1 = new ReferenceObject(10); // Tạo một đối tượng với giá trị ban đầu là 10
        System.out.println("Trước khi gọi hàm object1: " + object1.getValue()); // In giá trị ban đầu của đối tượng

        changeObject(object1); // Gọi phương thức để thay đổi giá trị của đối tượng

        System.out.println("Sau khi gọi hàm object1: " + object1.getValue()); // In giá trị sau khi thay đổi


        ReferenceObject object2 = new ReferenceObject(50); // Tạo một đối tượng với giá trị ban đầu là 50

        System.out.println("Trước khi gọi hàm object2: " + object2.getValue()); // In giá trị ban đầu của đối tượng

        ReferenceObject object3 = donotChangeObject(object2); // Gọi phương thức trả về đối tượng mới

        System.out.println("Sau khi gọi hàm object2: " + object2.getValue()); // In giá trị ban đầu của đối tượng gốc - không thay đổi

        System.out.println("object3: " + object3.getValue()); // In giá trị của đối tượng mới

    }
}
