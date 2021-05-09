public abstract class Client {
    private double balance;
    private double replenishmentCommission;
    private double withdrawalCommission;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void replenishment(double replenishment){
        setBalance(getBalance() + (replenishment - (replenishment * replenishmentCommission)));
    };

    public void withdrawal(double withdrawal){
        if(withdrawal - (withdrawal * withdrawalCommission) < balance){
            setBalance(getBalance() - (withdrawal - (withdrawal * withdrawalCommission)));
        } else {
            System.out.println("Not enough money");
        }
    };

    public void getInformation() {
        System.out.println("Replenishment commission is " + replenishmentCommission + "\n" +
                           "Withdrawal commission is " + withdrawalCommission + "\n" +
                           "Balance is " + getBalance() + "\n");

    }

}
