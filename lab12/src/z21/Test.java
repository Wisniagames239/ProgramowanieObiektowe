package z21;

import static z21.Animal.findMax;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal("Romek");
        Animal a2 = new Animal("Benek");
        Dog d1 = new Dog("Cecul", "Dalmatynczyk");
        Dog d2 = new Dog("Kazik", "Labrador");
        Dog d3 = new Dog("Kazik", "Dalmatynczyk");
        System.out.println(findMax(a1, a2));
        System.out.println(findMax(a1, d2));
        System.out.println(findMax(d1, d2));
        System.out.println(findMax(d2, d3));
    }
}
