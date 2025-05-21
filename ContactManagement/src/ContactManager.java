import java.util.Arrays;

// Lớp quản lý danh bạ
class ContactManager {
    private Contact[] contacts;

    public ContactManager(int maxSize) {
        contacts = new Contact[maxSize];
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {  // Tìm vị trí trống đầu tiên
                contacts[i] = contact;
                System.out.println("Thêm liên lạc thành công: " + contact);
                return;
            }
        }
        System.out.println("Danh bạ đã đầy, không thể thêm liên lạc mới.");
    }

    public void removeContact(String contactId) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getContactId().equals(contactId)) {
                // Dời các phần tử phía sau lên trước
                for (int j = i; j < contacts.length - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[contacts.length - 1] = null;  // Đặt phần tử cuối thành null
                System.out.println("Xóa liên lạc thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy liên lạc với ID: " + contactId);
    }

    public Contact[] findContactByName(String name) {
        Contact[] results = new Contact[contacts.length];
        int resultCount = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().toLowerCase().contains(name.toLowerCase())) {
                results[resultCount++] = contacts[i];
            }
        }
        return Arrays.copyOf(results, resultCount);
    }

    public void displayAllContacts() {
        boolean hasContacts = false;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(contacts[i]);
                hasContacts = true;
            }
        }
        if (!hasContacts) {
            System.out.println("Danh bạ trống.");
        }
    }
}
