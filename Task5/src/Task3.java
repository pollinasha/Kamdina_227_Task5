public class Task3 {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        ... // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + ... + " р.");
        ... // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + ... + " р.");
    }
}
class BankAccount {
    private long moneyAmount;

    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения
}