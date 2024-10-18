import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class zestaw4 {
    public static void main(String[] args) {
        //1
        int[] tablica=generujTablice(14,-5,10);
        //2
        wypiszTablice(tablica,4,4 );
        //3
        System.out.println(ileNieparzystych(tablica));
        System.out.println(ileParzystych(tablica));
        System.out.println(ileDodatnich(tablica));
        System.out.println(ileUjemnych(tablica));
        System.out.println(ileZerowych(tablica));
        System.out.println(ileMaxymalnych(tablica));
        System.out.println(ileMinimalnych(tablica));
        System.out.println(ileUnikalnych(tablica));
        System.out.println();
        System.out.println();
        //4
        System.out.println(sumaDodatnich(tablica));
        System.out.println(sumaUjemnych(tablica));
        System.out.println(sumaOdwrotnosci(tablica));
        System.out.println(sredniaArytmetyczna(tablica));
        System.out.println(sredniaGeometryczna(tablica));
        System.out.println(sredniaharmoniczna(tablica));
        System.out.println();
        System.out.println();
        //5
        wypisz(funkcjaLiniowa(tablica, 2,3));
        wypisz(funkcjaKwadratowa(tablica, 1,2,1));
        wypisz(funkcjaWykladnicza(tablica, 2));
        wypisz(funkcjaSignum(tablica));
        System.out.println();
        System.out.println();
        //6
        System.out.println(najdluzszyCiagDodatnich(tablica));
        System.out.println(najdluzszyCiagUjemnych(tablica));
        wypisz(odwrocTablice(tablica));
        wypisz(odwrocTablice(tablica, 3, 8));



        //7
        double[] tab = generujZakres(2, 1.25,6.25);
        //wypisz(tab);


    }
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc)
    {
        Random rand = new Random();
        int[] tablica = new int[n];
        tablica[0]=minWartosc;
        tablica[1]=maxWartosc;
        for(int i = 2; i < n; i++)
        {
            tablica[i] = rand.nextInt(minWartosc, maxWartosc+1);
        }
        return tablica;
    }
    public static void wypiszTablice(int[] tab, int n, int m)
    {
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(count<tab.length)
                {
                    System.out.printf("%d\t",tab[count++]);
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static int ileNieparzystych(int[] tab)
    {
        int count = 0;
        for(int i:tab)
        {
            if(i%2==1) count++;
        }
        return count;
    }
    public static int ileParzystych(int[] tab)
    {
        int count = 0;
        for(int i:tab)
        {
            if(i%2==0) count++;
        }
        return count;
    }
    public static int ileDodatnich(int[] tab)
    {
        int count = 0;
        for(int i:tab)
        {
            if(i>0) count++;
        }
        return count;
    }
    public static int ileUjemnych(int[] tab)
    {
        int count = 0;
        for(int i:tab)
        {
            if(i<0) count++;
        }
        return count;
    }
    public static int ileZerowych(int[] tab)
    {
        int count = 0;
        for(int i:tab)
        {
            if(i==0) count++;
        }
        return count;
    }
    public static int ileMaxymalnych(int[] tab)
    {
        int count = 0;
        int max = tab[0];
        for(int i:tab)
        {
            if(i>max) max=i;
        }
        for(int i:tab)
        {
            if(i==max) count++;
        }
        return count;
    }
    public static int ileMinimalnych(int[] tab)
    {
        int count = 0;
        int min = tab[0];
        for(int i:tab)
        {
            if(i<min) min=i;
        }
        for(int i:tab)
        {
            if(i==min) count++;
        }
        return count;
    }
    public static int ileUnikalnych(int[] tab)
    {
        int count = 0;
        boolean unikalna = true;
        for(int i=0; i<tab.length;i++)
        {
            unikalna=true;
            for(int j=0; j<i;j++)
            {
                if(tab[j]==tab[i]&&j!=i)
                {
                    unikalna=false;
                    break;
                }

            }
            if(unikalna) count++;
        }
        return count;
    }
    public static int sumaDodatnich(int[] tab)
    {
        int suma=0;
        for(int i:tab){
            if(i>0) suma+=i;
        }
        return suma;
    }
    public static int sumaUjemnych(int[] tab)
    {
        int suma=0;
        for(int i:tab){
            if(i<0) suma+=i;
        }
        return suma;
    }
    public static double sumaOdwrotnosci(int[] tab)
    {
        double suma=0;
        for(int i:tab){
            suma+=1/(double)i;
        }
        return suma;
    }
    public static double sredniaArytmetyczna(int[] tab) {
        int suma=0;
        for(int i:tab) {
            suma+=i;
        }
        return suma/(double)tab.length;
    }
    public static double sredniaGeometryczna(int[] tab) {
        int iloczyn=1;
        for(int i:tab) {
            iloczyn*=i;
        }
        return Math.pow(iloczyn,1/(double)tab.length);
    }
    public static double sredniaharmoniczna(int[] tab) {
        return tab.length/sumaOdwrotnosci(tab);
    }
    public static double[] funkcjaLiniowa(int[] tab, double a, double b)
    {
        double[] wartosci = new double[tab.length];
        for(int i=0;i<tab.length;i++) {
            wartosci[i]=a*tab[i]+b;
        }
        return wartosci;
    }
    public static double[] funkcjaKwadratowa(int[] tab, double a, double b, double c)
    {
        double[] wartosci = new double[tab.length];
        for(int i=0;i<tab.length;i++) {
            wartosci[i]=a*tab[i]*tab[i]+b*tab[i]+c;
        }
        return wartosci;
    }
    public static double[] funkcjaWykladnicza(int[] tab, double a)
    {
        double[] wartosci = new double[tab.length];
        for(int i=0;i<tab.length;i++) {
            wartosci[i]= Math.pow(a, tab[i]);
        }
        return wartosci;
    }
    public static int[] funkcjaSignum(int[] tab)
    {
        int[] wartosci = new int[tab.length];
        int znak;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]>0) znak=1;
            else if(tab[i]<0) znak=-1;
            else znak=0;
            wartosci[i]=znak;
        }
        return wartosci;
    }
    public static int najdluzszyCiagDodatnich(int[] tab)
    {
        int count = 0;
        int maxcount = 0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]>0) {
                count++;
            }
            else count = 0;
            if(count>maxcount)
            {
                maxcount=count;
            }

        }
        return maxcount;
    }
    public static int najdluzszyCiagUjemnych(int[] tab)
    {
        int count = 0;
        int maxcount = 0;
        for(int i=0;i<tab.length;i++) {
            if(tab[i]<0) {
                count++;
            }
            else count = 0;
            if(count>maxcount)
            {
                maxcount=count;
            }

        }
        return maxcount;
    }
    public static int[] odwrocTablice(int[] tab)
    {
        int[] wartosci = new int[tab.length];
        for(int i=0;i<tab.length;i++) {
            wartosci[i]=tab[tab.length-i-1];
        }
        return wartosci;
    }
    public static int[] odwrocTablice(int[] tab, int indeksStart, int indeksStop)
    {
        int[] wartosci = new int[tab.length];
        for(int i=0;i<tab.length;i++) {
            if(i>=indeksStart&&i<=indeksStop)
            {
                wartosci[i]=tab[indeksStop+indeksStart-i];
            }
            else {
                wartosci[i]=tab[i];
            }

        }
        return wartosci;
    }
    public static double[] generujZakres(int n, double minWartosc, double maxWartosc)
    {
        double krok = (maxWartosc-minWartosc)/(double)(n-1) ;
        krok = Math.round(krok*10000)/10000.0;
        double[] tablica = new double[n];
        double start = minWartosc;
        for(int i = 0; i < n; i++)
        {
            tablica[i] = start;
            start+=krok;
        }
        return tablica;
    }
    public static void wypisz(double[] tablica)
    {
        for(double i : tablica)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void wypisz(int[] tablica)
    {
        for(int i : tablica)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}