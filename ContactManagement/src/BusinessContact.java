// Lớp BusinessContact kế thừa từ Contact
class BusinessContact extends Contact {
    private String companyName;
    private String jobTitle;

    public BusinessContact(String contactId, String name, String phoneNumber, String companyName, String jobTitle) {
        super(contactId, name, phoneNumber);
        this.companyName = companyName;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + ", Company: " + companyName + ", Job Title: " + jobTitle;
    }
}