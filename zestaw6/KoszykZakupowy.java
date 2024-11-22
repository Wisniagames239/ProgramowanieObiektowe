import java.util.ArrayList;

public class KoszykZakupowy {
    ArrayList<Produkt> lista;
    public KoszykZakupowy() {
        lista = new ArrayList<>();
    }
    public void dodajProdukt(Produkt produkt, int n) {
            if(produkt.iloscNaMagazynie>=n)
            {
                for(int i = 0; i < n; i++)
                    lista.add(produkt);
                produkt.usunZMagazynu(n);
            }
            else
            {
                System.out.println("Nie ma więcej "+produkt.nazwa+ " na magazynie");
                return;
            }


    }
    public void wyswieltZawartoscKoszyka()
    {
        ArrayList<Produkt> listaKoszykaunique = new ArrayList<>();
        for(Produkt produkt : lista) {
            if (!listaKoszykaunique.contains(produkt))
                listaKoszykaunique.add(produkt);
        }
        for(Produkt produkt : listaKoszykaunique){
            int count=0;
            for(Produkt produkt2 : lista){
                if(produkt2.equals(produkt))
                    count++;
            }
            System.out.println(produkt.nazwa+" - "+count);
        }
    }
    public double obliczbCalkowitaWartosc()
    {
        double suma = 0;
        for(Produkt produkt : lista)
            suma+=produkt.cena;
        return Math.round(suma*100.0)/100.0;
    }
}
