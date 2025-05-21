package hasa;

// Lớp Car có mối quan hệ HAS-A với Engine
public class Car {
    private String model;
    private Engine engine; // Car HAS_A Engine

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}