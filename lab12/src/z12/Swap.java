package z12;

class Swap{
    public static <T> void swap(T[] tab, int i, int j)
    {
        try
        {
            var tmp = tab[i];
            tab[i] = tab[j];
            tab[j] = tmp;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Podałeś indeksy spoza");
        }
    }
}

class Test{
    public static void main(String[] args) {
        Integer[] a = new Integer[7];
        a[0] = 4;
        a[1] = 6;
        a[2] = 7;
        a[3] = 2;
        a[4] = 5;
        a[5] = 8;
        a[6] = 1;
        for(int i : a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        Swap.swap(a, 0, 9);
        for(int i : a)
        {
            System.out.print(i+" ");
        }
    }
}
