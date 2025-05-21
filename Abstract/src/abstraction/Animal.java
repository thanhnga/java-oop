package abstraction;

// Abstract class
abstract class Animal {
    String name; // Tên động vật

    protected Animal(String name) {
        this.name = name;
    }

    // Concrete method : phương thức chung cho tất cả lớp con
    void eat() {
        System.out.println(name + " is eating.");
    }

    // Abstract method
    abstract void sound();

}