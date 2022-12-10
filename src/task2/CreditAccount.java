package task2;

public class CreditAccount extends Account {
    private int amount = 0;
    private String name = "CreditAccount";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void pay(int balance) {
        System.out.println("Вы оплатили покупку на сумму: " + balance + " тг");
        amount = amount - balance;
        System.out.println("Ваш баланс составляет: " + amount + " тг");
    }

    @Override
    public void addMoney(int balance) {
        System.out.println("Ваш счет пополнен на: " + balance + " тг");
        amount = amount + balance;
        System.out.println("Ваш кредит оплачен, сумма: " + amount);
    }
}