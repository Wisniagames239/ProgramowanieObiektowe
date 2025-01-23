public class Box<T> {
    private T data;
    public Box(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public static <T> boolean isEqual(T obj1, T obj2){
        return obj1.equals(obj2);
    }
}
