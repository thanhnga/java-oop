package anonymous;

public class OuterClass {
    void display() {
        //Anonymous Inner
        HelloWorld helloWorld = new HelloWorld() {
            public void greet() {
                System.out.println("Hello World!");
            }
        };

        helloWorld.greet();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
