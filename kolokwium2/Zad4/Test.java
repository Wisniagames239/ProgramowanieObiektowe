package Zad4;

public class Test {
    public static void main(String[] args) {
        Storage<String> storage = new Storage<>();
        System.out.println(storage.retrieve());
        storage.store("Adad");
        System.out.println(storage.retrieve());
    }
}
