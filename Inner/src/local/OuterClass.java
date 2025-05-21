package local;

class OuterClass {

    void display() {
        //Local Inner
        class InnerClass {
            void show() {
                System.out.println("Inside local inner class");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.show();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
        // Không thể truy cập các method bên trong của Inner ở đây
    }
}

