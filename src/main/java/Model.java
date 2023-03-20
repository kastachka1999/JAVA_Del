

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Model {

    Phonebook currentBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currentContact() {

        return currentBook.getCotact(currentIndex);

    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String fname = reader.readLine();

            while (fname != null) {
                if (fname.equals("")){
                    fname = reader.readLine();
                }
                String lname = reader.readLine();
                String description = reader.readLine();
                if (lname == null) {continue;}
                this.currentBook.add(new Contact(fname, lname, description));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save2() {
        try (FileWriter writer = new FileWriter("C:\\create\\src\\main\\java\\date.json", false)) {
            writer.append("[\n");
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact(i);
                if(contact.toString().length() > 0 ) {
                    writer.append("   {\n");
                    writer.append(String.format("   \"FirstName\":\"%s\",\n", contact.firstName));
                    writer.append(String.format("   \"LastName\":\"%s\",\n", contact.lastName));
                    writer.append(String.format("   \"Description\":\"%s\"\n", contact.description));
                    writer.append("   },\n");
                }

            }
            writer.append("]");
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact(i);
                if(contact.toString().length() > 0 ) {
                    writer.append(String.format("%s\n", contact.firstName));
                    writer.append(String.format("%s\n", contact.lastName));
                    writer.append(String.format("%s\n", contact.description));
                    writer.append("\n");
                }
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Phonebook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}