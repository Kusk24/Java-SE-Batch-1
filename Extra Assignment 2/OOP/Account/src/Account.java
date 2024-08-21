public class Account {
    private int accountNumber;
    private double balance = 0.0;

    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalance(){
        return (int)this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void credit(double amount){
        this.balance += amount;
    }

    public void debit(double amount){
        if (amount > this.balance){
            System.out.println("amount withdrawn exceeds the current balance!");
        } else {
            this.balance -= amount;
        }
    }

    public String toString(){
        return "A/C no: " + this.accountNumber + " Balance=$" + this.balance;
    }




}
