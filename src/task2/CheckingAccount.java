package task2;

public class CheckingAccount extends Account {
    private int amount = 500;
    private String name = "CheckAccount";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void pay(int balance) {
        if (balance <= amount) {
            System.out.println("Вы оплатили покупку на сумму: " + balance + " тг");
            amount = amount - balance;
            System.out.println("Остаток на счету: " + amount + " тг");
        } else {
            System.out.println("Операция невозможна");
        }
    }

    @Override
    public void transfer(Account account, int balance) {
        if (balance <= amount) {
            System.out.println("Вы перевели " + balance + " тг на счет: " + account);
        } else {
            System.out.println("Операция невозможна ");
        }
    }

    @Override
    public void addMoney(int balance) {
        System.out.println("Ваш счет пополнен на: " + balance + " тг");
        amount = amount + balance;
        System.out.println("Сумма на счету составляет: " + amount + " тг");
    }
}