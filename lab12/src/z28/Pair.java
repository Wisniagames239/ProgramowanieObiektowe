package z28;

public class Pair<T>{
    T object1;
    T object2;


    public static void findMinMaxAge(Dog[] tab, Pair<?super Dog> result)
    {
        Dog max = tab[0];
        Dog min = max;
        for(int i=0; i<tab.length; i++) {
            if(tab[i].getAge() > max.getAge()){
                max = tab[i];
            }
            else if(tab[i].getAge() < min.getAge()){
                min = tab[i];
            }
        }
        result.object1 = max;
        result.object2 = min;
    }
}
