import java.util.Objects;

public class Computer {
    String brand;
    Processor procesor;
    public Computer(String brand, Processor procesor) {
        this.brand = brand;
        this.procesor = procesor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Processor getProcesor() {
        return procesor;
    }

    public void setProcesor(Processor procesor) {
        this.procesor = procesor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "brand='" + brand + '\'' +
                ", procesor=" + procesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(brand, computer.brand) && Objects.equals(procesor, computer.procesor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, procesor);
    }
}
