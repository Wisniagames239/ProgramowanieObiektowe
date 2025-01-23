package z5;

public class AuthenticationTest {
    public static void main(String[] args) {
        UserAuthentication u1 = new UserAuthentication();
        System.out.println(u1.login("Dominik","Wisniewski"));
        System.out.println(u1.resetPassword("Dominik","Wisniewski","Wi"));
        u1.logout();
        AdminAuthentication a1 = new AdminAuthentication();
        System.out.println(a1.login("Dominik","Wisniewski"));
        System.out.println(a1.resetPassword("Dominik","Wisniewski","Wi"));
        a1.logout();


    }
}
