package modifier;

public class PersonMain {

    public static void main(String[] args) {
        // Tạo một đối tượng Person
        Person person = new Person();

        // Có thể truy cập biến name(không khai báo modifier)
        person.name = "Nga Nguyễn";

        // Có thể truy cập biến title(protected modifier)
        person.title = "Solution Developer";

        // Có thể truy cập biến address(public modifier)
        person.address = "Việt Nam";

        //Không thể truy cập biến age(private)
//        person.age = 40;

        // Sử dụng phương thúc để cập nhật age
        person.setAge(40);

        //In ra các thông tin
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.getAge());
        System.out.println("Title: " + person.title);
        System.out.println("Address: " + person.address);


    }
}
