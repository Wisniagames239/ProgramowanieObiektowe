import java.time.LocalDate;
import java.time.LocalTime;
class zestaw1 {
    public static void main(String[] args) {
        //1.
        System.out.println("Dominik Wisniewski");
        //2.
        String imie = "Dominik";
        String nazwisko = "Wisniewski";
        int len = (imie+nazwisko).length();
        System.out.println(len);
        //3
        String w1 = "Ala";
        String w2 = "ma";
        String w3 = "kota";
        String w = w1 + " "+w2+" "+ w3;
        System.out.println(w);
        //4
        System.out.println("                    *");
        System.out.println("                    * *");
        System.out.println("                    * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                    * * *");
        System.out.println("                    * *");
        System.out.println("                    *");
        System.out.println("          *");
        System.out.println("         * *");
        System.out.println("        * * *");
        System.out.println("       * * * *");
        System.out.println("      * * * * *");
        System.out.println("     * * * * * *");
        System.out.println("      * * * * *");
        System.out.println("       * * * *");
        System.out.println("        * * *");
        System.out.println("         * *");
        System.out.println("          *");
        //5
        String wnowe = w.replace("a","e");
        System.out.println(wnowe);
        //6
        wnowe = wnowe.toUpperCase();
        System.out.println(wnowe);
        wnowe = wnowe.toLowerCase();
        System.out.println(wnowe);
        //7
        System.out.println((int)'A');
        System.out.println((int)'!');
        System.out.println((int)'@');
        System.out.println((int)'>');
        System.out.println((int)'~');
        System.out.println((int)'\n');
        System.out.println((int)'\b');
        //8
        System.out.printf("%d - %d - male\n",(int)'a',(int)'z');
        System.out.printf("%d - %d - duze\n",(int)'A',(int)'Z');
        System.out.printf("%d - %d - cyfry\n",(int)'0',(int)'9');
        //9
        String zad9 = "Grzesiek nie wiedzial dlaczego ... jest drapieznym ... mimo, ze jego ... na to nie wskazuje";
        String kropki = "\\.\\.\\.";
        zad9 = zad9.replaceFirst(kropki, "wiking");
        zad9 = zad9.replaceFirst(kropki, "wikingiem");
        zad9 = zad9.replaceFirst(kropki, "wikingia");
        System.out.println(zad9);
        //10
        String zdanie2 = "... to najlepsza ksiazka napisana przez ...";
        zdanie2 = zdanie2.replaceFirst("\\.\\.\\.","Pan Tadeusz");
        zdanie2 = zdanie2.replaceFirst("\\.\\.\\.","Daniela Olbrylchskiego");
        System.out.println(zdanie2);
        //11
        for(int i=0;i<4;i++)
        {
            System.out.print("wodrze");
        }
        System.out.printf("\n");
        //12
        System.out.println("Dzisiaj jest "+LocalTime.now()+" godzina "+ LocalDate.now());
        //13
        System.out.println((char)54);
        System.out.println((char)103);
        System.out.println((char)241);
        System.out.println((char)67);
        System.out.println((char)9999);
        System.out.println((char)len);
        System.out.println((char)174939);

    }
}