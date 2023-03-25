import java.io.*;
import java.util.*;

public class JsonContactExporter implements ContactExporter {
    @Override
    public void exportContacts(List<Contact> contacts, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), new ContactData(contacts));
    }
}
