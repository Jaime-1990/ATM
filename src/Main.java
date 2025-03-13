public class Main {
    public static void main(String[] args) {
        System.out.println("Dinero total en el sistema: $" + ATM.totalMoney);
        System.out.println("Número total de cajeros: " + ATM.numATMs);

        ATM firtsATM = new ATM(1000, "Bancolombia");
        ATM secondATM = new ATM(500, "Davivienda");
        firtsATM.withdrawMoney(350);
        secondATM.withdrawMoney(200);
        firtsATM.depositMoney(800);
        secondATM.depositMoney(1200);
        firtsATM.checkBalance();
        secondATM.checkBalance();


        System.out.println("Dinero total en el sistema: $" + ATM.totalMoney);
        System.out.println("Número total de cajeros: " + ATM.numATMs);
        ATM.averageMoney();

    }
}