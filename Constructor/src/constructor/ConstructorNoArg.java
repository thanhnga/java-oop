package constructor;

public class ConstructorNoArg {
    private String brand;
    private String model;


    // Khởi tạo không tham số
    public ConstructorNoArg() {
        this.brand = "Unknown";
        this.model = "Unknown";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        // Khởi tạo object với phương thức khởi tạo không tham số
        ConstructorNoArg constructorNoArg = new ConstructorNoArg();

        // Truy xuất các thuộc tính của class
        System.out.println("Brand: " + constructorNoArg.getBrand());
        System.out.println("Model: " + constructorNoArg.getModel());
    }

}
