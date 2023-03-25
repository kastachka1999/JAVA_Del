import java.io.*;
import java.util.*;
public class ContactData {
    private List<Contact> contacts;

    public ContactData(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
