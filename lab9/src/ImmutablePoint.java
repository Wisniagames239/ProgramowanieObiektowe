import java.util.Objects;

public class ImmutablePoint {
    private double x;
    private double y;
    private double z;
    public ImmutablePoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Punkt " +
                "x=" + x +
                ", y=" + y +
                ", z=" + z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return Double.compare(x, that.x) == 0 && Double.compare(y, that.y) == 0 && Double.compare(z, that.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
