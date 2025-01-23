package z14;


class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int result = name.compareTo(o.name);
        if (result != 0) {
            return result;
        }
        return age - o.age;

    }
}
class Test{
    public static <T extends Comparable<T>> T minValue(T[] tab){
        if(tab ==null||tab.length == 0) return null;
        var min = tab[0];
        for(T i : tab)
        {
            if(min.compareTo(i) > 0)
            {
                min = i;
            }
        }
        return min;

    }
}
class Main
{
    public static void main(String[] args) {
        Integer[] a = new Integer[4]; a[0] = 2; a[1] = 1; a[2] = 4; a[3] = 9;
        String[] b = new String[3]; b[0] = "B"; b[1] = "p"; b[2] = "h";
        Double[] c = new Double[4]; c[0] = 15.2; c[1] = 1.4; c[2] = 6.2; c[3] = 7.2;
        System.out.println(Test.minValue(a));
        System.out.println(Test.minValue(b));
        System.out.println(Test.minValue(c));
        Person[] p = new Person[3];
        p[0] = new Person("AC",14);
        p[1] = new Person("BB",51);
        p[2] = new Person("AC", 16);
        System.out.println(Test.minValue(p));

    }
}


