package isa;

public class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    public void scratch() {
        System.out.println("Cat scratches the furniture");
    }
}
