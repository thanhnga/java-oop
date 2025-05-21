package member;

public class OuterClass {
    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    // Inner Class
    class InnerClass {
        public void display() {
            System.out.println("Outer data: " + outerData);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        InnerClass inner =  outer.new InnerClass();
        inner.display();
    }
}
