// Lớp cơ bản Contact
abstract class Contact {
    private String contactId;
    private String name;
    private String phoneNumber;

    public Contact(String contactId, String name, String phoneNumber) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getContactId() {
        return contactId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "ID: " + contactId + ", Name: " + name + ", Phone: " + phoneNumber;
    }
}