package z21;

public class Animal implements Comparable<Animal> {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static <T extends Animal> T findMax(T element1, T element2)
    {
        if(element1.compareTo(element2) >= 0)
        {
            return element1;
        }
        return element2;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                "name='" + name + ',';
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareTo(o.name);
    }
}
