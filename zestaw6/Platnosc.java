public class Platnosc {
    double kwota;
    String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        statusPlatnosci = "nieoplacone";
    }
    public void zaplac()
    {
        statusPlatnosci = "oplacone";
        kwota = 0;
    }
}
