public record Person1(String imie, int wiek) {
    public Person1{
        if(wiek<0)
        {
            wiek=0;
        }
    }
}
