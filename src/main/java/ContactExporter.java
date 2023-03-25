import java.io.*;
import java.util.*;

public interface ContactExporter {
    void exportContacts(List<Contact> contacts, String fileName) throws IOException;
}

