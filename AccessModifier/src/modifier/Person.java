package modifier;

public class Person {
    // thuộc tính name là modifier mặc định
    String name;

    // thuộc tính age là modifier private
    private int age;

    // thuộc tính address là modifier public
    public String address;

    // thuộc tính address là modifier protected
    protected String title;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.age = 40;
    }
}
