public class Kolokwium1 {
    public static void main(String[] args) {
        //Grupa 1
        // Zad 1
        System.out.println("Zad 1");
        int[] r = new int[3];
        r[0] = 3;
        r[1] = 5;
        r[2] = 2;
        int[] ciagn = ciagArytmetycznyRodzajuM(5,3,1, r);
        wypisz(ciagn);
        //Zad 2
        System.out.println("Zad 2");
        int[] ciag = new int[5];
        ciag[0] = 1;
        ciag[1] = 8;
        ciag[2] = 27;
        ciag[3] = 64;
        ciag[4] = 125;
        System.out.println(czyCiagArytmetyczny(ciag));
        //Zad3
        System.out.println("Zad 3");
        System.out.println(czyCiagArytmetycznyRodzajuM(ciag, 3));
        //Zad 4
        int[] tab = new int[7];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 0;
        tab[3] = 3;
        tab[4] = 5;
        tab[5] = 1;
        tab[6] = 4;
        System.out.println("Zad 4");
        System.out.println(podciag(tab));
        // Zad 5
        int[] tab2 = new int[4];
        tab2[0] = 1;
        tab2[1] = 4;
        tab2[2] = 2;
        tab2[3] = 4;
        System.out.println("Zad 5");
        System.out.println(podciag(tab2,2));
        // Zad6
        System.out.println("Zad 6");
        sekwencjaCollatza(7, 6);
        // Zad 7
        System.out.println("\nZad 7");
        minMaxSekwencjaCollatza(7, 6);


    }
    public static void wypisz(int[] tab)
    {
        for(int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();
    }
    public static int[] ciagArytmetycznyRodzajuM(int n, int m, int a1, int[] r)
    {
        int[] ciag = new int[n];
        ciag[0]= a1;
        for(int mi = 0; mi <= m; mi++)
        {
            for(int i=1;i<n;i++)
            {
                if(mi==0)
                {
                    ciag[i]=a1;
                }
                else
                {
                    ciag[i]+=(int)Math.pow(i,mi)*r[mi-1];
                }
            }

        }
        return ciag;
    }
    public static boolean czyCiagArytmetyczny(int [] tab)
    {
        if(tab.length <2||tab==null){
            return false;
        }
        int r = tab[1]-tab[0];
        for(int i = 1; i<tab.length; i++)
        {
            if(tab[i]-tab[i-1]!=r)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean czyCiagArytmetycznyRodzajuM(int[] tab, int m)
    {
        int[] r = new int[tab.length-1];
        if(tab.length <2||tab==null){
            return false;
        }
        int rdlug = r.length;
        for(int mi = 1; mi <= m; mi++)
        {
            for(int i = 0; i<rdlug; i++)
            {
                if(mi==1)
                {
                    r[i] = tab[i+1]-tab[i];
                }
                else
                {
                    r[i] = r[i+1]-r[i];
                }
            }
            rdlug--;
        }
        for(int i = 0; i<rdlug; i++)
        {
            if(r[0]!=r[i])
            {
                return false;
            }
        }
        return true;
    }
    public static int podciag(int[] tab)
    {
        int count = 1;
        int maxcount = 0;
        if(tab==null)
            return 0;
        for(int i =0; i<tab.length; i++)
        {
            if(count==1||tab[i]>tab[i-1])
            {
                count++;
            }
            else
            {
                maxcount = count;
                count=1;
            }
        }
        return maxcount;
    }
    public static int podciag(int[] tab, int r)
    {
        if(tab==null)
            return 0;
        int count = 1;
        int maxcount = 0;
        for(int i =0; i<tab.length; i++)
        {
            if(count==1||tab[i]==tab[i-1]+r)
            {
                count++;
            }
            else
            {
                maxcount = count;
                count=1;
            }
        }
        return maxcount;
    }
    public static void sekwencjaCollatza(int n, int c)
    {
        int tmp = c;
        for(int i = 0; i<n; i++)
        {
            if(tmp%2==0)
            {
                System.out.print(tmp+" ");
                tmp=tmp/2;
            }
            else
            {
                System.out.print(tmp+" ");
                tmp=3*tmp+1;
            }
        }

    }
    public static void minMaxSekwencjaCollatza(int n, int c)
    {
        int tmp = c;
        int max = c;
        int min = c;
        for(int i = 1; i<n; i++)
        {
            if(tmp%2==0)
            {
                tmp=tmp/2;
            }
            else
            {
                tmp=3*tmp+1;
            }
            if(tmp>max) max=tmp;
            else if(tmp<min) min=tmp;
        }
        System.out.println("min="+min+"\nmax="+max);
    }
}