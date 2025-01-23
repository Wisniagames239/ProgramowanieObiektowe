package z21;

public class Company extends Client{
    private int numberOfEmployees;

    public Company(String lastName, double balace, int numberOfEmployees) {
        super(lastName, balace);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfEmployees=" + numberOfEmployees +
                '.';
    }

    @Override
    public int compareTo(Client client) {
        if(client instanceof Company)
        {
            Company company = (Company) client;
            int result = super.compareTo(client);
            if(result != 0)
            {
                return result;
            }
            return this.numberOfEmployees-company.getNumberOfEmployees();
        }
        return super.compareTo(client);


    }
}
