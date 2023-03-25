import java.io.*;
import java.util.*;
public class TxtContactImporter implements ContactImporter {
    @Override
    public List<Contact> importContacts(String fileName) throws IOException {
        List<Contact> contacts = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 2) {
                Contact contact = new Contact(parts[0], parts[1]);
                contacts.add(contact);
            }
        }
        reader.close();
        return contacts;
    }
}
