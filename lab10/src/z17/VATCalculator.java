package z17;

public interface VATCalculator {
    double vatRate = 0.23;
    static double calculateWithVAT(double price)
    {
        return price + vatRate*price;
    }
}
