package hasa;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Engine
        Engine engine = new Engine("V8");

        // Tạo một đối tượng Car và truyền đối tượng Engine vào
        Car car = new Car("Toyota Camry", engine);
        // Lấy thông tin của xe
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Engine: " + car.getEngine().getType());

        Boat boat = new Boat("Super Fast", engine);
        // Lấy thông tin của thuyền
        System.out.println("Boat Name: " + boat.getName());
        System.out.println("Boat Engine: " + boat.getEngine().getType());

    }
}