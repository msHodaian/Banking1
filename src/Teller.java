public class Teller {
    private final int id;
    private Customer customer;
    private int timeLeft;

    public Teller(int id) {
        this.id = id;
    }

    public boolean isFree() {
        return customer == null;
    }

    public void serve(Customer customer) {
        this.customer = customer;
        timeLeft = customer.getServiceTime();
        System.out.println("Customer " + customer.getId() + " arrived at " + customer.getEntryTime() + " minutes and started being served by teller " + id + ".");
    }
    public void tick() {
        if (customer != null) {
            for (int i = 0; i < 240; i++) {
                timeLeft--;

                if (timeLeft == 0) {
                    System.out.println("Customer " + customer.getId() + " finished being served by teller " + id + " at " + (customer.getDepartureTime() + 1) + " minutes.");
                    customer = null;
                }
            }
        }
    }
}
