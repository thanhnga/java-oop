public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.name = "Mazda 5";
        car.brand = "Toyota";

        System.out.println("Name:" + car.name);
        System.out.println("Brand:" + car.brand);

        car.start();

        car.stop();

    }
}
