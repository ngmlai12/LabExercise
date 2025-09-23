package J13_Recording.Forum;

import java.util.Scanner;

public class ForumUi {
    public static Scanner keyboard = new Scanner(System.in);
    public static Forum forum = new Forum();
    public static String username;
    public static String password;
    public static int choice;

    public static void main(String[] args) {
        while(true) {
        LoginPage();
        while(true) {
            HomePage();
            choice = keyboard.nextInt();
            keyboard.nextLine();
            if (choice == 1) {
                BrowseAllPosts();
            } else if (choice == 2) {
                CreateANewPost();
            } else if (choice == 3) {

            } else if (choice == 4) {

            } else if (choice == 5) {

            }else if (choice == 0) {
                System.out.println("Bye " + forum.login(username, password).getDisplayName() + "~");
                break;
            }

        }
        }
    }

    public static void LoginPage() {

        do {
            System.out.println("Welcome to the forum. Please login.");
            System.out.print("Username: ");
            username = keyboard.nextLine();
            System.out.print("");
            System.out.print("Password: ");
            password = keyboard.nextLine();
            System.out.println();
            if (forum.login(username, password) == null) {
                System.out.println("Login Failed! Please try again.");
            } else {
                System.out.println("Login Successful!");
            }
        } while (forum.login(username, password) == null);
    }

    public static void HomePage() {

        System.out.println("Welcome " + forum.login(username, password).getDisplayName() + "!");
        System.out.println("1. Browse all posts");
        System.out.println("2. Create a new post");
        System.out.println("3. ChangePassword");
        if (forum.login(username, password) instanceof AdminUser) {
            System.out.println("4. Delete post by title");
            System.out.println("5. Delete user by username");
        }
        System.out.println();
        System.out.println("0. Logout");
        System.out.println();
        System.out.print("Input a number: ");
    }

    public static void BrowseAllPosts() {
        for (Post post : forum.getPosts()) {
            System.out.println(post.getTitle()+"    "+post.getContent());
        }
    }

    public static void CreateANewPost() {

        System.out.print("Input the post title: ");
        String title = keyboard.nextLine();
        System.out.println();
        System.out.print("Input the post content: ");
        String content = keyboard.nextLine();
        System.out.println();
        Post post = new Post(title, content);
        forum.createPost(post);
        System.out.println("A new post is created!");
        keyboard.nextLine();
    }
}
