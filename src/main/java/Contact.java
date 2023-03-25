public class Contact {
    private String name;

    private String lastName;
    private String phone;

    public Contact(String name,String lastName, String phone) {
        this.name = name;
        this.phone = phone;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
