package Zad5;

public class Test {
    public static void main(String[] args) {
        AdminAuthentication admin = new AdminAuthentication();
        System.out.println(admin.login("admin", "admin"));
        admin.logout();
        System.out.println(admin.resetPassword("Admin", "admin", "Owsianka"));
        UserAuthentication user = new UserAuthentication();
        System.out.println(user.login("User", "user"));
        user.logout();
        System.out.println(user.resetPassword("user", "user", "Owsianka"));

    }
}
