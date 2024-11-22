public class zastaw6 {
    public static void main(String[] args) {
        //Zad1
        /*
        Produkt produkt = new Produkt("Jablko", 0.24, 2);
        produkt.wyswietlInformacje();
        produkt.dodajDoMagazynu(5);
        produkt.wyswietlInformacje();
        produkt.usunZMagazynu(10);
        produkt.wyswietlInformacje();
        produkt.usunZMagazynu(3);
        produkt.wyswietlInformacje();
        */
        //Zad 2
        KoszykZakupowy kosz = new KoszykZakupowy();
        Produkt jablko = new Produkt("jablko", 0.24, 5);
        Produkt gruszka = new Produkt("gruszka", 0.3, 2);
        Produkt cytryna = new Produkt("cytryna", 0.2, 10);
        //kosz.dodajProdukt(jablko,4);
        //kosz.dodajProdukt(gruszka, 3);
        //kosz.dodajProdukt(cytryna, 4);
        //kosz.wyswieltZawartoscKoszyka();
        //System.out.println(kosz.obliczbCalkowitaWartosc());
        //Zad3
        Zamowienie zamowienie = new Zamowienie(kosz);
        //zamowienie.wyswietlZamowienie();
        zamowienie.ustawStatusZamowienia("wysłany");
        //zamowienie.wyswietlZamowienie();
        //Zad4
        Zamowienie zamowienie2 = new Zamowienie(kosz);
        Klient klient1 = new Klient("Dominik", "Wiśniewski");
        klient1.dodajZamowienie(zamowienie);
        klient1.dodajZamowienie(zamowienie2);
        //klient1.wyswieltHistorieZamowien();
        //System.out.println(klient1.obliczLacznyKosztZamowien());
        //Zad5
        Sklep sklep = new Sklep();
        sklep.dodajProdukt(jablko);
        sklep.dodajProdukt(gruszka);
        sklep.dodajProdukt(cytryna);
        sklep.wyswietlOferty();
        Produkt szuk = sklep.wyszukajProduktu("jablko");
        sklep.zakupy(szuk, 5, zamowienie);
        sklep.wyswietlOferty();
        //Zad6
        zamowienie.finalizujZamowienie();
        zamowienie.platnosc.zaplac();
        zamowienie.finalizujZamowienie();
        zamowienie.wyswietlZamowienie();
        szuk.wyswietlInformacje();
        zamowienie.zwrocProdukt(szuk, 5);
        szuk.wyswietlInformacje();


    }
}
