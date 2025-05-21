package constructor;

class Person {
    // class này không chưa bất kì constructor nào
    String name = "Nga";
}
public class DefaultConstructor {

    public static void main(String[] args) {

        // Tạo một đối tượng của class DefaultConstructor
        Person person = new Person();
        System.out.println(person.name);
    }
}
