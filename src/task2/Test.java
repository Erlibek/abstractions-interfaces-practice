package task2;

public class Test {
    public static void main(String[] args) {
        Account credit = new CreditAccount();
        Account save = new SavingsAccount();
        Account check = new CheckingAccount();
        check.transfer(new CreditAccount(), 600);
        check.pay(300);
    }
}