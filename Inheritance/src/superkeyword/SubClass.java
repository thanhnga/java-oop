package superkeyword;

public class SubClass extends SuperClass {
    String type = "Old";

    public void print() {
//        age = 40;
//        name = "Nga";

        super.age = 40;
        super.name = "Nga";

        // thừa hưởng phương thức từ lớp cha
//        display();
        super.display();

        // thừa hưởng thuộc tính của cha
//        System.out.println("Name trong lớp cha: " + name);
//        System.out.println("Age trong lớp cha: " + age);

        System.out.println("Name trong lớp cha: " + super.name);
        System.out.println("Age trong lớp cha: " + super.age);

        // thuộc tính của lớp con
        System.out.println("Type trong lớp con: " + type);
    }

}
