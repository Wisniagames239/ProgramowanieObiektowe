import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        listaZamowien = new ArrayList<>();
    }
    public void dodajZamowienie(Zamowienie z){
        listaZamowien.add(z);
    }
    public void wyswieltHistorieZamowien()
    {
        System.out.println("Klient "+imie+ " "+nazwisko);
        for(Zamowienie z : listaZamowien)
        {
            z.wyswietlZamowienie();
            System.out.println();
        }

    }
    public double obliczLacznyKosztZamowien()
    {
        double suma = 0.0;
        for(Zamowienie z : listaZamowien)
        {
            suma+= z.koszykZakupowy.obliczbCalkowitaWartosc();
        }
        return suma;
    }
}
