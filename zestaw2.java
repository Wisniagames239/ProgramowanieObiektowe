import java.lang.Math;
import java.util.Scanner;
public class zestaw2 {
    public static void main(String[] args) {
        //1.
        System.out.println(((Object)(23.0+76)).getClass().getName());
        System.out.println(((Object)(23.0+76)).getClass().getName());
        System.out.println(((Object)(5-33)).getClass().getName());
        System.out.println(((Object)(109%3)).getClass().getName());
        System.out.println(((Object)(50/2)).getClass().getName());
        System.out.println(((Object)(4|2)).getClass().getName());
        System.out.println(((Object)(3^5)).getClass().getName());
        System.out.println(((Object)(7&9)).getClass().getName());
        //2
        double wynik = (Math.sqrt(7)-1)/2 + (Math.pow(3,3))%2;
        wynik = (int)wynik;
        System.out.println(wynik);

        double wynik2 = 2004/(1*10);
        wynik2 = (int)wynik2;
        System.out.println(wynik2);

        double wynik3 = (3+Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1;
        wynik3 = (int)wynik3;
        System.out.println(wynik3);

        double wynik4 = 625%26%4;
        wynik4 = (int)wynik4;
        System.out.println(wynik4);

        double wynik5 = (("Wisniewski".length())%("Dominik".length())+1)/Math.pow(2,0.25);
        wynik5 = (int)wynik5;
        System.out.println(wynik5);

        //4
        Scanner scanner = new Scanner(System.in);
        //String a = scanner.nextLine();
        //String b = scanner.nextLine();
        //System.out.println(a+b);
        //5
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(p+q);
        System.out.println(p-q);
        System.out.println(p*q);
        System.out.println(p/q);
        //6
        double liczba = scanner.nextDouble();
        System.out.println(liczba+140);
        System.out.println(liczba-31);
        System.out.println(liczba*7);
        System.out.println(liczba/13);
        System.out.println(liczba%7);
        System.out.println((int)liczba/4);
        System.out.println(Math.pow(liczba,45));
        System.out.println((int)liczba&67);
        System.out.println((int)liczba|59);
        System.out.println((int)liczba^23);
        System.out.println((int)liczba<<5);
        System.out.println((int)liczba>>6);






    }
}