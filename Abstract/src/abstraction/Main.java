package abstraction;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird("Chirpy the Bird");
        Animal lion = new Lion("Leo the Lion");

        // Làm việc trên đối tượng cha - trừu tượng
        Animal[] animals = {lion, bird};
        for (Animal animal : animals){
            animal.eat();
            animal.sound();
        }
    }
}
