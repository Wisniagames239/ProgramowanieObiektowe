public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;
    Platnosc platnosc;

    public Zamowienie(KoszykZakupowy kosz)
    {
        koszykZakupowy = kosz;
        statusZamowienia = "skladane";
        platnosc = new Platnosc(koszykZakupowy.obliczbCalkowitaWartosc());
    }
    public void ustawStatusZamowienia(String status)
    {
        statusZamowienia = status;
    }
    public void wyswietlZamowienie()
    {
        koszykZakupowy.wyswieltZawartoscKoszyka();
        System.out.println("Status: "+ statusZamowienia);
    }
    public void finalizujZamowienie()
    {
        if(platnosc.statusPlatnosci=="oplacone")
            statusZamowienia = "Gotowe do wysyłki";

    }public void zwrocProdukt(Produkt p, int n)
    {
        for(int j=0; j<n; j++)
        {
            for(int i =0; i<koszykZakupowy.lista.stream().count();i++)
            {
                Produkt a = koszykZakupowy.lista.get(i);
                if(a.equals(p))
                {
                    koszykZakupowy.lista.remove(i);
                    break;
                }
            }
        }
        p.dodajDoMagazynu(n);


    }


}
