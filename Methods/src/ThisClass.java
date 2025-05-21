public class ThisClass {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        ThisClass thisClass = new ThisClass();
        thisClass.setNumber(10);
        System.out.println(thisClass.getNumber());
    }
}

