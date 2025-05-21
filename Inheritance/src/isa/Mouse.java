package isa;

public class Mouse extends Animal {

    @Override
    void sound() {
        System.out.println("Mouse squeaks");
    }

    public void runAway() {
        System.out.println("Mouse runs away quickly");
    }
}
