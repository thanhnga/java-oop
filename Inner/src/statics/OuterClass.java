package statics;

class OuterClass {
    private int outerData;
    private static int staticOuterData = 10;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    //Static Inner
    static class InnerClass {
        public void display() {
            //System.out.println("Outer data: " + outerData); // LỖI
            System.out.println("Outer data: " + staticOuterData);
        }
    }

    public static void main(String[] args) {
        // Khởi tạo một instance của static inner class
//        InnerClass inner = new InnerClass(); //OK
        InnerClass inner = new OuterClass.InnerClass(); //OK
        // Gọi phương thức display() của static inner class
        inner.display();
    }
}


