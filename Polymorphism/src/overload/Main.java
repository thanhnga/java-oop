package overload;

public class Main {
    public static void main(String[] args) {
        MathOperation operation = new MathOperation();

        System.out.println(operation.add(1,2));

        System.out.println(operation.add(1,2, 3));

        System.out.println(operation.add(1.0f,2.0f));

        System.out.println(operation.add(1.0f,2.0f, 3.0f));

    }
}
