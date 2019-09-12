package chapter15;

class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw() {
        balance = balance - amount;
    }
}

public class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {

    }

    @Override
    public void run() {

    }
}
