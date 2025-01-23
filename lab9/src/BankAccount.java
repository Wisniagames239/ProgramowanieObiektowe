public record BankAccount(long numerkonta, double saldo) {
    public BankAccount(long numerkonta){
        this(numerkonta,0);
    }
}
