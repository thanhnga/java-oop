package abstraction;

// Concrete class
class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " roars.");
    }
}

