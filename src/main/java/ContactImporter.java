import java.io.*;
import java.util.*;

public interface ContactImporter {
    List<Contact> importContacts(String fileName) throws IOException;
}
