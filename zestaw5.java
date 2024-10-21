import java.util.ArrayList;
import java.util.Collection;

public class zestaw5 {
    public static void main(String[] args) {
        //1.
        ArrayList<Integer> tab1 = new ArrayList<>();
        ArrayList<Integer> tab2 = new ArrayList<>();
        tab1.add(1);
        tab1.add(4);
        tab2.add(3);
        tab2.add(9);
        //System.out.println(append(tab1,tab2));
        //2.
        tab1.add(4);
        tab1.add(6);
        //System.out.println(merge(tab1, tab2));

        //3
        System.out.println(mergeSorted(tab1, tab2));
        //4
        String napis = "BajoJajo";
        System.out.println(toArrayList(napis));
        //5
        System.out.println(checkChar(toArrayList(napis),'B'));
        System.out.println(countChar(toArrayList(napis),'j'));
        //6


        //7.
        ArrayList<String> tabs = new ArrayList<>();
        tabs.add("A");
        tabs.add("B");
        tabs.add("B");
        tabs.add("D");
        System.out.println(uniqueArrayList(tab1));
        System.out.println(uniqueArrayListS(tabs));
        //8.
        System.out.println(countArrayList(toArrayList(napis)));

    }
    public static ArrayList<String> toArrayList(String napis)
    {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < napis.length(); i++)
        {
            list.add(napis.charAt(i)+"");
        }
        list.sort(null);
        return list;
    }
    public static boolean checkChar(ArrayList<String> tab, char znak)
    {
        for(int i = 0; i < tab.size(); i++)
        {
            if(tab.get(i).charAt(0)==znak) return true;
        }
        return false;
    }
    public static boolean checkCharSS(ArrayList<ArrayList<String>> tab, char znak)
    {
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 0; i < tab.size(); i++)
        {
            temp = tab.get(i);
            if(temp.get(0).charAt(0)==znak) return true;
        }
        return false;
    }
    public static int countChar(ArrayList<String> tab, char znak){
        int count = 0;
        for(int i = 0; i < tab.size(); i++)
        {
            if(tab.get(i).charAt(0)==znak) count++;
        }
        return count;
    }
    public static ArrayList<ArrayList<String>> countArrayList(ArrayList<String> tab)
    {
        ArrayList<ArrayList<String>> lista = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp;
        int n=0;
        for(int i=0; i<tab.size(); i++)
        {
            if(!checkCharSS(lista,tab.get(i).charAt(0)))
            {
                n = countChar(tab,tab.get(i).charAt(0));
                temp = new ArrayList<String>();
                temp.add(tab.get(i));
                temp.add(Integer.toString(n));
                lista.add(temp);
            }

        }
        return lista;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        tab1.sort(null);
        tab2.sort(null);
        int i=0,j=0;
        while(i<tab1.size()&&j<tab2.size())
        {
            if(tab1.get(i)<tab2.get(j))
            {
                lista.add(tab1.get(i++));
            }
            else {
                lista.add(tab2.get(j++));
            }
        }
        while(i<tab1.size())
        {
            lista.add(tab1.get(i++));
        }
        while(j<tab2.size())
        {
            lista.add(tab2.get(j++));
        }
        return lista;


    }
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i : tab1)
        {
            lista.add(i);
        }
        for(int i : tab2)
        {
            lista.add(i);
        }
        return lista;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int i;
        for(i=0; i<tab1.size()&&i<tab2.size(); i++)
        {
            lista.add(tab1.get(i));
            lista.add(tab2.get(i));
        }
        while(i<tab1.size())
        {
            lista.add(tab1.get(i++));
        }
        while(i<tab2.size())
        {
            lista.add(tab2.get(i++));
        }
        return lista;


    }
    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> tab)
    {
        ArrayList<ArrayList<Integer>> lista = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        boolean jo = true;
        for(int i=0; i<tab.size(); i++)
        {
            for(int j=0;j<i&&jo;j++)
            {
                if(tab.get(i)==tab.get(j)&&i!=j){
                    jo=false;
                }
            }
            if(jo)
            {
                temp = new ArrayList<Integer>();
                temp.add(tab.get(i));
                temp.add(0);
                lista.add(temp);
            }
            jo=true;
        }
        return lista;
    }
    public static ArrayList<ArrayList<String>> uniqueArrayListS(ArrayList<String> tab)
    {
        ArrayList<ArrayList<String>> lista = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<String>();
        boolean jo = true;
        for(int i=0; i<tab.size(); i++)
        {
            for(int j=0;j<i&&jo;j++)
            {
                if(tab.get(i)==tab.get(j)&&i!=j){
                    jo=false;
                }
            }
            if(jo){
                temp = new ArrayList<String>();
                temp.add(tab.get(i));
                temp.add("0");
                lista.add(temp);
            }
            jo=true;

        }
        return lista;
    }
}
