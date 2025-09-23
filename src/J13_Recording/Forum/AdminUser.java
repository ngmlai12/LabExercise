package J13_Recording.Forum;

public class AdminUser extends User{
    private boolean canDeletePost;
    private boolean canDeleteUser;

    public AdminUser(String username, String password, String displayName) {
        super(username, password, displayName);
    }
    public boolean deletePost (){
        return this.canDeletePost = true;
    }
    public boolean deleteUser (){
        return this.canDeleteUser = true;
    }
}
