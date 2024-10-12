import java.util.Scanner;
import java.lang.Math;
public class zestaw3 {
    public static void main(String[] args) {
        //1.
        int n1 = 10;
        //trojkiPitagorejskie(n1);
        //2.
        int n2 = 10;
        //funKwaRozwiazania(n2);
        int n3 = 30;
        //funKwaDelta((n3));
        //4.
        int n4 = 100;
        //liczbyPierwsze(n4);
        //5.
        int m5=3;
        int n5 = 7;
        //liczbyPodzielne(m5,n5);
        //piramida(7,2);
        //piramida(6,2);
        //7
        int n7 = 5;
        //System.out.println(silnia(n7));
        //8
        int n8 = 5;
        //System.out.println(silniaPodwojna(n8));
        //9.
        int n9=9;
        int m9=4;
        //System.out.println(silniamn(m9,n9));
        //10
        int n10 = 6;
        int k10 = 5;
        //System.out.println(dwumianNewtona(n10,k10));
        //11.
       // ciagFibonacciego(10);
        //12
        sumaNaturalnych(5);
        sumaParzystych(5);
        sumaNieparzystych(5);
        sumaKwaNaturalnych(5);
        sumaSzeNaturalnych(5);
        sumaOdwNaturalnych(5);
        //13
        czyPalindrom("kajak");
        //14
        trojkatPascala(5);
        //15
        czyPalindromint(1512);
        //15
        czyDoskonala(29);
        //16
        czyPierwsza(7);
        //17
        System.out.println(NWD(282,78));
        //18
        int n18 = 8;
        int[] tab = wczytajTablice(n18);
        wypiszTablice(tab);
        //19
        podzbiory(tab);


    }
    public static void trojkiPitagorejskie(int n)
    {
        for(int i =1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(Math.sqrt(i*i+j*j)==Math.floor(Math.sqrt(i*i+j*j)))
                    System.out.printf("%d %d %d\n",i,j,(int)Math.sqrt(i*i+j*j));
            }
        }
    }
    public static void funKwaRozwiazania(int n)
    {
        for(int a=0;a<=n;a++)
        {
            for(int b = 0;b<=n;b++)
            {
                for(int c = 0;c<=n;c++)
                {
                    if(b*b-4*a*c>=0)
                    {
                        System.out.printf("%d %d %d\n",a,b,c);
                    }
                }
            }
        }
    }
    public static void funKwaDelta(int n)
    {
        for(int a=1;a<=n;a++)
        {
            for(int b = 0;b<=n;b++)
            {
                for(int c = 0;c<=n;c++)
                {
                    if(Math.sqrt(b*b-4*a*c)==Math.floor(Math.sqrt(b*b-4*a*c)))
                    {
                        System.out.printf("%d %d %d\n",a,b,c);
                    }
                }
            }
        }
    }
    public static void liczbyPierwsze(int n)
    {
        boolean isprime = true;
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<i;j++)
            {
                if((i%j==0)&&(i!=j))
                {
                    isprime = false;
                    break;
                }
            }
            if(isprime)
            {
                System.out.print(i+" ");
            }
            isprime = true;
        }
    }
    public static void liczbyPodzielne(int m, int n)
    {
        for(int i = (int)Math.pow(10,m-1);i<(int)Math.pow(10,m);i++)
        {
            if(i%n==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void piramida(int n, int variant)
    {
        if(variant == 1)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.printf("\n");
            }

        }
        else if(variant == 2)
        {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }


    }
    public static int silnia(int n){
        int silnia=1;
        for(int i=1;i<=n;i++)
        {
            silnia*=i;
        }
        return silnia;
    }
    public static int silniaPodwojna(int n){
        int silnia=1;
        for(int i=n;i>=1;i-=2)
        {
            silnia*=i;
        }
        return silnia;
    }
    public static int silniamn(int m,int n){
        int silnia=1;
        for(int i=n;i>=1;i-=m)
        {
            silnia*=i;
        }
        return silnia;
    }
    public static int dwumianNewtona(int n, int k)
    {
        return silnia(n)/(silnia(k)*silnia(n-k));
    }
    public static void ciagFibonacciego(int n)
    {
        int a =0;
        int b =1;
        int fib = 1;
        for(int i=0;i<n;i++)
        {
            if(i<2)
            {
                    System.out.print(fib+" ");
            }
            else {
                System.out.print(fib+" ");
            }
            fib=a+b;
            a=b;
            b=fib;

        }
    }
    public static void sumaNaturalnych(int n)
    {
        int suma = 0;
        for(int i=0;i<=n;i++)
        {
            suma+=i;
        }
        System.out.println(suma);
    }
    public static void sumaParzystych(int n)
    {
        int suma = 0;
        for(int i=0;i<=n;i+=2)
        {
            suma+=i;
        }
        System.out.println(suma);
    }
    public static void sumaNieparzystych(int n)
    {
        int suma = 0;
        for(int i=1;i<=n;i+=2)
        {
            suma+=i;
        }
        System.out.println(suma);
    }
    public static void sumaKwaNaturalnych(int n)
    {
        int suma = 0;
        for(int i=0;i<=n;i++)
        {
            suma+=i*i;
        }
        System.out.println(suma);
    }
    public static void sumaSzeNaturalnych(int n)
    {
        int suma = 0;
        for(int i=0;i<=n;i++)
        {
            suma+=i*i*i;
        }
        System.out.println(suma);
    }
    public static void sumaOdwNaturalnych(int n)
    {
        float suma = 0;
        for(int i=1;i<=n;i++)
        {
            suma+=1.0/i;
        }
        System.out.println(suma);
    }
    public static void czyPalindrom(String wyraz)
    {
        boolean palindrome = true;
        for(int i=0;i<wyraz.length();i++)
        {
            if(wyraz.charAt(i)!=wyraz.charAt(wyraz.length()-i-1))
            {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
    }
    public static void trojkatPascala(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(dwumianNewtona(i,k)+" ");
            }
            System.out.println();
        }
    }
    public static void czyPalindromint(int n)
    {
        boolean palindrome = true;
        int oryginalna=n;
        int odwrocona=0;
        while(n>0)
        {
            int znak = n%10;
            odwrocona = odwrocona*10+znak;
            n/=10;
        }
        if(oryginalna!=odwrocona)
        {
            palindrome = false;
        }
        System.out.println(palindrome);
    }
    public static void czyDoskonala(int n)
    {
        boolean doskonala = true;
        int sumapodz=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0) sumapodz+=i;
        }
        if(n!=sumapodz)doskonala = false;
        System.out.println(doskonala);
    }
    public static void czyPierwsza(int n)
    {
        boolean pierwsza = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) pierwsza=false;
        }
        System.out.println(pierwsza);
    }
    public static int NWD(int a, int b)
    {
        int pom=a;
        while(pom!=0)
        {
            pom=a%b;
            a=b;
            b=pom;
        }
        return a;
    }
    public static int[] wczytajTablice(int n)
    {
        int[] tab = new int[n];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            tab[i] = scanner.nextInt();
        }
        return tab;
    }
    public static void wypiszTablice(int[] tab)
    {
        for(int liczba:tab) System.out.print(liczba+" ");
    }
    public static void podzbiory(int[] tab)
    {
        int dlugosc = tab.length;
        int ilosc = (int)Math.pow(2,dlugosc);
        for(int i=0;i<ilosc;i++)
        {
            System.out.print("{ ");
            for(int j=0;j<dlugosc;j++)
            {
                if((i&(1<<j))>0) System.out.print(tab[j]+" ");
            }
            System.out.println("}");

        }
    }
}
