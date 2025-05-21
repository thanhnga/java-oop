public class ComplexDayMain {
    public static void main(String[] args) {
        ComplexDay today = getDay();

        // Sử dụng khi so sánh: ==
        if (today == ComplexDay.MONDAY) {
            System.out.println("Hôm nay là " + today.getValue());
        } else {
            System.out.println("Hôm nay không phải Thứ Hai.");
        }

        // lấy enum từ tên
        String name = "MONDAY";
        ComplexDay day = ComplexDay.valueOf(name);
        System.out.println("Enum: " + day.name() +", " + day.getValue());

        // Sử dụng trong vòng lặp
        loop();

        // Sử dụng trong switch case
        switchCase(today);
    }

    private static void loop(){
        // Lấy tất cả các giá trị của enum
        ComplexDay[] days = ComplexDay.values();
        System.out.println("Tất cả các giá trị của enum ComplexDay:");
        for (ComplexDay day : days) {
            System.out.println("- " + day.getValue());
        }
    }

    private static void switchCase(ComplexDay day){
        // Sử dụng switch-case để xử lý theo ngày
        String value = day.getValue();
        switch (day) {
            case MONDAY:
                System.out.println(value + ": đầy năng lượng!");
                break;
            case TUESDAY:
                System.out.println(value + ": cố gắng tiếp tục nhé!");
                break;
            case WEDNESDAY:
                System.out.println(value + ": hãy giữ phong độ.");
                break;
            case THURSDAY:
                System.out.println(value + ": sắp cuối tuần!");
                break;
            case FRIDAY:
                System.out.println(value + ": hãy cố lên!");
                break;
            case SATURDAY:
                System.out.println(value + ": thư giãn thôi!");
                break;
            case SUNDAY:
                System.out.println(value + ": nghỉ ngơi và chuẩn bị cho tuần mới.");
                break;
        }
    }

    private static ComplexDay getDay(){
        return ComplexDay.MONDAY;
    }
}
