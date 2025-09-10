public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.withdrawAll();
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount(){
        return moneyAmount;

    }
    public void setMoneyAmount(long newMoneyAmount){
        this.moneyAmount = newMoneyAmount;

    }

    public void withdrawAll(){
        moneyAmount = 0;
        System.out.println("Со счёта снято " + moneyAmount + "р.");
    }
}

