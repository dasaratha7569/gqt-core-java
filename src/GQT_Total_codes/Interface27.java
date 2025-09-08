package GQT_Total_codes;
interface Writables {
    void write(String data);
}

interface Readables {
    void read();
}

class TextFiles implements Writables, Readables {
    String content = "";
    public void write(String data) { content = data; System.out.println("Written to TextFile: " + data); }
    public void read() { System.out.println("Reading from TextFile: " + content); }
}

class DatabaseTables implements Writables, Readables {
    String record = "";
    public void write(String data) { record = data; System.out.println("Inserted record in Database: " + data); }
    public void read() { System.out.println("Reading record from Database: " + record); }
}

public class Interface27 {
    public static void main(String[] args) {
        TextFiles tf = new TextFiles();
        tf.write("Hello.txt");
        tf.read();

        DatabaseTables db = new DatabaseTables();
        db.write("Row1 Data");
        db.read();
    }
}