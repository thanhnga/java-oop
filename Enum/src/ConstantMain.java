public class ConstantMain {
    public static void main(String[] args) {
        String day = getDay();
        if (Constant.MONDAY.equals(day)){
            System.out.println("Hôm nay là Thứ Hai");
        }
        else if (Constant.TUESDAY.equals(day)){
            System.out.println("Hôm nay là Thứ Ba");
        }else{
            System.out.println("Hôm nay là Thứ " + day);
        }
    }

    private static String getDay(){
        return "MONDAY";
    }
}
