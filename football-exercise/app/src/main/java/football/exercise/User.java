package football.exercise;

public class User {
    public String name;
    public String email;
    private String[] roles;
    private boolean admin;

    public User(String name, String email, String[] roles, boolean admin) {
        this.name = name;
        this.email = email;
        this.roles = roles;
        this.admin = admin;
    }
}
