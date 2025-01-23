package z21;

public class Client implements Comparable<Client> {
    private String lastName;
    private double balace;

    public Client(String lastName, double balace) {
        this.lastName = lastName;
        this.balace = balace;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "  lastName='" + lastName + '\'' +
                ", balace=" + balace +
                ',';
    }

    @Override
    public int compareTo(Client o) {
        return Double.compare(this.balace, o.balace) != 0 ?
                Double.compare(this.balace, o.balace)
                : lastName.compareTo(o.lastName);
    }
}
