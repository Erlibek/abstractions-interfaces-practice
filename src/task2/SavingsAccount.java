package task2;

public class SavingsAccount extends Account{
    private int amount = 600;
    private String name = "SaveAccount";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void transfer(Account account, int balance) {
        if (balance <= amount){
            System.out.println("Вы перевели "+ balance +  " тг на счет: " + account);
        }else {
            System.out.println("Операция невозможна ");
        }
    }

    @Override
    public void addMoney(int balance) {
        System.out.println("Ваш сберегательный счет пополнен на: " + balance + "тг");
        amount = amount + balance;
        System.out.println("Сумма на счету составляет: " + amount + "тг");
    }
}