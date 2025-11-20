public class BankAccount {

    private String iban;
    private long balanceInCents;

    public BankAccount(String iban, long initialBalanceInCents) {

        if (iban == null ) {
            throw new IllegalArgumentException("IBAN null");
        }

        if (initialBalanceInCents < 0) {
            throw new IllegalArgumentException("Le solde est negatif");
        }
        this.iban = iban;
        this.balanceInCents = initialBalanceInCents;
    }

    public void deposit(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant  doit etre positif.");
        }
        balanceInCents += amount;
    }

    public void withdraw(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant  doit etre positif.");
        }
        if (amount > balanceInCents) {
            throw new IllegalArgumentException("Impossible a retraire.");
        }
        balanceInCents -= amount;
    }


    public long getBalanceInCents() {
        return balanceInCents;
    }

   public String GetIban(){
     return iban;
   }
}
