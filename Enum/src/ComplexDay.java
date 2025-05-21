public enum ComplexDay {
    MONDAY("Thứ Hai"),
    TUESDAY("Thứ Ba"),
    WEDNESDAY("Thứ Tư"),
    THURSDAY("Thứ Năm"),
    FRIDAY("Thứ Sáu"),
    SATURDAY("Thứ Bảy"),
    SUNDAY("Chủ nhật");

    private final String value;

    ComplexDay(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
