import java.awt.print.Book;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Zad1
        var book1 = new BookDT0("AA","BB",24,1999);
        var book2 = new BookDT0("DD","BB",32,2000);
        var book3 = new BookDT0("GRD","BFa",24,2010);
        //Zad2
        var adres1 = new Address("Nowa",72,"87-300","Brodnica");
        var czlek = new Person("Dominik","Wisniewski",adres1);
        //Zad6
        var car1 = new Car("Volkswagen","Golf",6.5);
        //System.out.println(car1.fuelcost(6.19,240));
        //Zad9
        var czlek1 = new Person1("DD",64);
        var czlek2 = new Person1("GRD",-5);
        //System.out.println(czlek1);
        //System.out.println(czlek2);
        //Zad10
        var konto1 = new BankAccount(365837556, 523);
        var konto2 = new BankAccount(856372734);
        //System.out.println(konto1);
        //System.out.println(konto2);
        //Zad1*
        var album = new MusicAlbum("kaka","dadd");
        var album1 = new MusicAlbum("kaka","dadd");
        album.dodajOcene(5);
        album.dodajOcene(4.6);
        album.dodajOcene(5.5);
        album.dodajOcene(5);
        album.usunOcene(6);
        album.usunOcene(5);
        album1.dodajOcene(4.6);
        album1.dodajOcene(5.5);
        album1.dodajOcene(5);
        System.out.println(album);
        var albumr = new RockAlbum("kaka","dadd",album.getRatings(), "dd");
        System.out.println(album.equals(album1));
        System.out.println(albumr.equals(album));
        System.out.println(album.hashCode());
        System.out.println(albumr.hashCode());
        System.out.println(album);
        System.out.println(albumr);
        //Zad8
        var procesor = new Processor(352.6,6,"ilnte");
        var komputer = new Computer("Unitra", procesor);
        System.out.println(komputer.hashCode());
        System.out.println(komputer);
    }
}