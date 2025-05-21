public class MethodOverloading {
    // Phương thức tính tổng cho hai số nguyên
    public int add(int a, int b) {
        return a + b;
    }

    // Phương thức tính tổng cho hai số thực
    public double add(double a, double b) {
        return a + b;
    }

    // Phương thức tính tổng cho ba số nguyên
    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        int ab = methodOverloading.add(1,2);
        System.out.println("a+b=" + ab);

        int abc = methodOverloading.add(1,2,3);
        System.out.println("a+b+c=" + abc);

        double d = methodOverloading.add(1.0,2.0);
        System.out.println("double: a+b=" + d);

    }
}

