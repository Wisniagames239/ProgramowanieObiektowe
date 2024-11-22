public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    public void wyswietlInformacje()
    {
        System.out.println("Nazwa " + nazwa);
        System.out.println("Cena " + cena);
        System.out.println("Ilosc na magazynie " + iloscNaMagazynie);
    }
    public void dodajDoMagazynu(int n)
    {
        iloscNaMagazynie+=n;
    }
    public void usunZMagazynu(int n)
    {
        if(iloscNaMagazynie >= n) iloscNaMagazynie-=n;
    }
}
