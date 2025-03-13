public class ATM {
    private int money;
    private final String name;

    public static int totalMoney = 0;
    public static int numATMs = 0;



    public static void averageMoney() {
        System.out.println("Dinero promedio en los cajeros: $" + totalMoney / numATMs);
    }


    public ATM(int inputMoney, String name) {
        this.money = inputMoney;
        this.name = name;
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void checkBalance() {
        System.out.println("Cajero " + this.name);
        System.out.println("Saldo: $ " + this.money);
    }

    public void depositMoney(int moneyToDeposit) {
        if (moneyToDeposit > 0) {
            this.money += moneyToDeposit;
            totalMoney += moneyToDeposit;
        }
    }

    public void withdrawMoney(int moneyToWithdraw) {
        if (moneyToWithdraw <= this.money) {
            this.money -= moneyToWithdraw;
            totalMoney -= moneyToWithdraw;
        }
    }

}
