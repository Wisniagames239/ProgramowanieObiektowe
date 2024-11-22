import java.util.ArrayList;

public class Sklep {
    ArrayList<Produkt> produkty;

    public Sklep() {
        produkty = new ArrayList<>();
    }
    public void dodajProdukt(Produkt p) {
        produkty.add(p);
    }
    public void wyswietlOferty()
    {
        System.out.println("Lista produktów:");
        for(Produkt p : produkty)
        {
            System.out.println("- "+p.nazwa);
        }
    }
    public Produkt wyszukajProduktu(String nazwa)
    {
        for(Produkt p : produkty)
        {
            if(nazwa.equals(p.nazwa))
                return p;
        }
        return null;
    }
    public void zakupy(Produkt p, int n, Zamowienie z){
        z.koszykZakupowy.dodajProdukt(p,n);
        if(p.iloscNaMagazynie==0)
            produkty.remove(p);
    }
}
