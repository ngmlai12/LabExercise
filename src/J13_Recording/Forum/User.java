package J13_Recording.Forum;

public class User {
    private String username;
    private String password;
    private String displayName;
    private boolean canCreatePost;

    public User(String username, String password, String displayName) {
        this.username = username;
        this.password = password;
        this.displayName = displayName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean changePassword(String password, String newPassword) {
        if (this.password.equals(password)) {
            this.password = newPassword;
            return true;
        }else {
            return false;
        }
    }
}
