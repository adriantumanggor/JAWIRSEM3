public class User {
    private String id;
    private String phone;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String phone, String id) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.id = id;
    }

    public boolean login(String identifier, String password) {
        return (this.username.equals(identifier) || this.phone.equals(identifier)) && this.password.equals(password);
    }
}
