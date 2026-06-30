class DatabaseConnection {

    private static DatabaseConnection obj;

    private DatabaseConnection() {
        System.out.println("Database Connection Created");
    }

    public static DatabaseConnection getConnection() {
        if (obj == null) {
            obj = new DatabaseConnection();
        }
        return obj;
    }

    public void display() {
        System.out.println("Singleton Object is Working");
    }
}

public class SingletonPattern {

    public static void main(String[] args) {

        DatabaseConnection first = DatabaseConnection.getConnection();
        DatabaseConnection second = DatabaseConnection.getConnection();

        first.display();

        if (first == second) {
            System.out.println("Both references point to the same object.");
        } else {
            System.out.println("Different objects created.");
        }
    }
}