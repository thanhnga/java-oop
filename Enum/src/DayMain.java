public class DayMain {
    public static void main(String[] args) {
        Day today = getDay();

        // Sử dụng khi so sánh: ==
        if (today == Day.MONDAY) {
            System.out.println("Hôm nay là Thứ Hai");
        } else {
            System.out.println("Hôm nay không phải Thứ Hai.");
        }

        String name = "MONDAY";
        // lấy enum từ tên
        Day day = Day.valueOf(name);

        // Lấy tên
        System.out.println("Hôm nay là " + day.name());

        // Sử dụng trong vòng lặp
        loop();

        // Sử dụng trong switch case
        switchCase(today);
    }

    private static void loop(){
        // Lấy tất cả các giá trị của enum
        Day[] days = Day.values();
        System.out.println("Tất cả các giá trị của enum Day:");
        for (Day day : days) {
            System.out.println("- " + day);
        }
    }

    private static void switchCase(Day day){
        // Sử dụng switch-case để xử lý theo ngày
        switch (day) {
            case MONDAY:
                System.out.println("Thứ Hai: đầy năng lượng!");
                break;
            case TUESDAY:
                System.out.println("Thứ Ba: cố gắng tiếp tục nhé!");
                break;
            case WEDNESDAY:
                System.out.println("Thứ Tư: hãy giữ phong độ.");
                break;
            case THURSDAY:
                System.out.println("Thứ Năm: sắp cuối tuần!");
                break;
            case FRIDAY:
                System.out.println("Thứ Sáu: hãy cố lên!");
                break;
            case SATURDAY:
                System.out.println("Thứ Bảy: thư giãn thôi!");
                break;
            case SUNDAY:
                System.out.println("Chủ Nhật: nghỉ ngơi và chuẩn bị cho tuần mới.");
                break;
        }
    }

    private static Day getDay(){
        return Day.MONDAY;
    }
}
