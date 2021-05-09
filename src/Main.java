public class Main {
    public static void main(String[] args) {
        Client client = new ClientTypeEntrepreneur();
        client.setBalance(1000);
        client.replenishment(2000);
        client.withdrawal(500);
        client.getInformation();
    }
}
