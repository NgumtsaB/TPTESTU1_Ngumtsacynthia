public class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phone;
    private String city;
    private double balancePersonnel;

    // Constructor, getters, setters
    public class EmailInvalidException extends Exception { /* ... */ }
    public class DeletionInvalidException extends Exception { /* ... */ }

    public double analyseSoldeGeneral() throws NegativeGeneralBalanceException {
        double totalBalance = users.stream().mapToDouble(User::getBalancePersonnel).sum();
        if (totalBalance < 0) throw new NegativeGeneralBalanceException("Negative general balance");
        return totalBalance;
    }

    public User getRichestUser() { /* Find user with max balance */ }


}

    public static ArrayList<User> users = new ArrayList<>();

    public static void add(User user) { /* Add user to list with validation */ }
    public static void delete(int id) { /* Delete user or throw exception */ }
    public static void list() { /* List all users */ }
    public static void display(int id) { /* Display specific user */ }

