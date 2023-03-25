import java.io.*;
import java.util.*;



public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(String firstName, String lastName, String phoneNumber) {
        Contact newContact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(newContact);
    }

    public void showContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
}
