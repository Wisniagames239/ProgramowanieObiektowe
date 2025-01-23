package z23;

public class Alg {
    public static <T> T findMax(Pair<? extends Animal> a){
        return a.getSecond();
    }
}
