import java.io.*;
import java.util.*;

public class JsonContactImporter implements ContactImporter {
    @Override
    public List<Contact> importContacts(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ContactData data = mapper.readValue(new File(fileName), ContactData.class);
        return data.getContacts();
    }
}
