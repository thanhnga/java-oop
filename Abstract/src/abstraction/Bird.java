package abstraction;

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }


    @Override
    public void sound() {
        System.out.println(name + " chirps.");
    }
}