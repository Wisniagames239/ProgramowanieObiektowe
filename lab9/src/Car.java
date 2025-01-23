public record Car(String brand, String model, double fuelConsumptionPer100km) {
    public double fuelcost(double fuelPrice, double distance){
        return Math.round(fuelPrice*distance*100)/100.0;
    }
}
