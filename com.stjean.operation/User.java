public class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phone;
    private String city;
    private double balancePersonnel;

    // Constructor, getters, setters
}

    public static ArrayList<User> users = new ArrayList<>();

    public static void add(User user) { /* Add user to list with validation */ }
    public static void delete(int id) { /* Delete user or throw exception */ }
    public static void list() { /* List all users */ }
    public static void display(int id) { /* Display specific user */ }

public class EmailInvalidException extends Exception { /* ... */ }
public class DeletionInvalidException extends Exception { /* ... */ }
