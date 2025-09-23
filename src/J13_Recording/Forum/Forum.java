package J13_Recording.Forum;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<User> users = new ArrayList<>(List.of(
            new User("user", "1111", "qqqq"),
            new AdminUser("admin", "2222", "wwww"),
            new AdminUser("a", "3333", "eeee"),
            new AdminUser("b", "4444", "rrrr")
    ));
    private List<Post> posts = new ArrayList<>(50);
    private User loginUser;


    public List<Post> getPosts() {
        return posts;
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loginUser = user;
                return loginUser;
            }
        }
        return null;
    }

    public User loginOut() {
        return loginUser = null;
    }

    public void createPost(Post post) {
        posts.add(post);
    }

    public int deletePostByTitle(String postTitle) {
        if (loginUser instanceof AdminUser) {
            return 1;
        } else if (loginUser instanceof User) {
            return -1;
        }

        for (Post post : posts) {
            if (post.getTitle().equals(postTitle)) {
                posts.remove(post);
                return 100;
            }
        }

        return -2;
    }

    public int deleteUserByUsername(String username) {
        if (loginUser instanceof AdminUser) {
            return 1;
        } else if (loginUser instanceof User) {
            return -1;
        }

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                users.remove(user);
                return 100;
            }
        }

        return -2;
    }

}
