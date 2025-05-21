package final_keyword;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class FinalExample {

    public void modifyPerson(final Person person) {
        //person = new Person("Nga Nguyễn"); // Lỗi: Không thể gán lại tham số final
        person.setName("Nga Nguyễn");        // OK: Có thể thay đổi trạng thái bên trong object
    }

    public static void main(String[] args) {
        Person person = new Person("Nga");
        FinalExample example = new FinalExample();

        System.out.println("Trước khi gọi hàm: " + person.name); // In ra: Nga
        example.modifyPerson(person);                           // Thay đổi tên thành Nga Nguyễn
        System.out.println("Sau khi gọi hàm: " + person.name);  // In ra: Nga Nguyễn
    }
}


