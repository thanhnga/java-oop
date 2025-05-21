package hasa;

public class Boat {
    private String name;
    private Engine engine; // Car HAS_A Engine

    public Boat(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }
}
