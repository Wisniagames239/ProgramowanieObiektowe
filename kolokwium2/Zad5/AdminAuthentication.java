package Zad5;

public class AdminAuthentication implements Authentication {
    @Override
    public boolean login(String username, String password) {
        String tus = "Admin";
        String pass = "admin";
        return username.equals(tus) && password.equals(pass);
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        String tus = "Admin";
        String pass = "admin";
        return username.equals(tus) && oldPassword.equals(pass);
    }
}
