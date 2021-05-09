public class ClientTypeEntrepreneur extends Client{
    private double balance;
    private double replenishmentCommission = 0.01;
    private double withdrawalCommission = 0;

    @Override
    public void replenishment(double replenishment) {
        if(replenishment < 1000){
            setBalance(getBalance() + (replenishment - (replenishment * replenishmentCommission)));
        }
        else if(replenishment >= 1000) {
            setBalance(getBalance() + (replenishment - (replenishment * replenishmentCommission / 2)));
        }

    }

    @Override
    public void getInformation() {
        System.out.println("Replenishment commission if <1000 is " + replenishmentCommission + "\n" +
                "Replenishment commission if >1000 is " + replenishmentCommission / 2 + "\n" +
                "Withdrawal commission is " + withdrawalCommission + "\n" +
                "Balance is " + getBalance() + "\n");

    }
}
