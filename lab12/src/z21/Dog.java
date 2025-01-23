package z21;

public class Dog extends Animal{
    private String rasa;

    public Dog(String name, String rasa) {
        super(name);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    @Override
    public int compareTo(Animal o) {
        int result = super.compareTo(o);
        if(result != 0)
        {
            return result;
        }
        Dog d = (Dog)o;
        return rasa.compareTo(d.rasa);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", rasa='" + rasa;
    }
}
