package GQT_Total_codes;
interface Serializable {
    void serialize();
}

interface Deserializable {
    void deserialize();
}

class FileData implements Serializable, Deserializable {
    public void serialize() { System.out.println("File serialized."); }
    public void deserialize() { System.out.println("File deserialized."); }
}

class Database implements Serializable, Deserializable {
    public void serialize() { System.out.println("Database serialized."); }
    public void deserialize() { System.out.println("Database deserialized."); }
}

public class Interface13 {
    public static void main(String[] args) {
        FileData file = new FileData();
        file.serialize();
        file.deserialize();

        Database db = new Database();
        db.serialize();
        db.deserialize();
    }
}