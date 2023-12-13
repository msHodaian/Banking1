public class Customer {
    private int id;
    private int entryTime;
    private int serviceTime;
    private int departureTime;

    public Customer() {
    }

    public Customer(int id, int entryTime, int serviceTime, int departureTime) {
        this.id = id;
        this.entryTime = entryTime;
        this.serviceTime = serviceTime;
        this.departureTime = departureTime;
    }

    public int getId() {
        return id;
    }

    public int getEntryTime() {
        return entryTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }
}
