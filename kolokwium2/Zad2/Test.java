package Zad2;

public class Test {
    public static void main(String[] args) {
        Bitmap bitmap = new Bitmap();
        Vector vector = new Vector();
        bitmap.loadFile();
        bitmap.saveFile();
        vector.loadFile();
        vector.saveFile();
    }
}
