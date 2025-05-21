public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager(50);

        // Thêm một số liên lạc mẫu
        manager.addContact(new PersonalContact("1", "Nguyễn Văn A", "123456789", "Bạn bè"));
        manager.addContact(new BusinessContact("2", "Trần Thị B", "987654321", "TechCorp", "Lập trình viên"));
        manager.addContact(new PersonalContact("3", "Lê Minh C", "555666777", "Gia đình"));

        // Hiển thị danh sách liên lạc
        System.out.println("Danh sách liên lạc ban đầu:");
        manager.displayAllContacts();

        // Tìm kiếm liên lạc theo tên
        System.out.println("\nKết quả tìm kiếm với từ khóa 'A':");
        Contact[] results = manager.findContactByName("A");
        for (Contact contact : results) {
            System.out.println(contact);
        }

        // Xóa liên lạc theo ID
        System.out.println("\nXóa liên lạc với ID 1:");
        manager.removeContact("1");

        // Hiển thị danh sách sau khi xóa
        System.out.println("\nDanh sách liên lạc sau khi xóa:");
        manager.displayAllContacts();
    }
}
