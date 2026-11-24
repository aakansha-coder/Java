class BankAccount {
    private int balance = 0;

    public void deposite(int amount){
        balance = balance + amount;
        IO.println("Deposited: " + amount);
    }


public int  getBalance() {
  return balance;
}

}

public class Oops_qns {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposite(2000);
        IO.println("Current Balance: " + b1.getBalance());
    }
}