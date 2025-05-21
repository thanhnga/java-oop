// Lớp PersonalContact kế thừa từ Contact
class PersonalContact extends Contact {
    private String relationship;

    public PersonalContact(String contactId, String name, String phoneNumber, String relationship) {
        super(contactId, name, phoneNumber);
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return super.toString() + ", Relationship: " + relationship;
    }
}