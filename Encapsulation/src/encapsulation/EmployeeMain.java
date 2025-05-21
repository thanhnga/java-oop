package encapsulation;

public class EmployeeMain {

    public static void main(String[] args) {
        // Tạo một đối tượng Employee mới
        Employee employee = new Employee();

        // Đặt tên và lương cho nhân viên thông qua setter
        employee.setName("Nga Nguyễn");
        employee.setSalary(2000);

        // Lấy thông tin về nhân viên thông qua getter
        String employeeName = employee.getName();
        double employeeSalary = employee.getSalary();

        // In thông tin nhân viên
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: $" + employeeSalary);

    }
}
