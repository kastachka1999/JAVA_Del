import java.io.*;
import java.util.*;
public class TxtContactExporter implements ContactExporter {
    @Override
    public void exportContacts(List<Contact> contacts, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (Contact contact : contacts) {
            writer.write(contact.getName() + "," + contact.getPhone() + System.lineSeparator());
        }
        writer.close();
    }
}
