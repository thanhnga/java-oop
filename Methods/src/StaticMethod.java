public class StaticMethod {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {

        StaticMethod.myStaticMethod();

        StaticMethod method = new StaticMethod();
        method.myPublicMethod();

    }
}

