public class Method {

    void addAndPrint(int x, int y) {
        int sum = x + y;
        System.out.println("Tổng: " + sum);
    }

    float sum(float x, float y){
        return x + y;
    }

    Person findPerson(Person person){
        return new Person();
    }

    public static void main(String[] args) {
        Method method = new Method();
        method.addAndPrint(5, 10);

        float sum = method.sum(5.0f, 10.0f);
        System.out.println("sum=" + sum);
    }

}
