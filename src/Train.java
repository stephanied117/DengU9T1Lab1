public class Train extends Vehicle {
    private int stops;
    private String destination;
    public Train(String name, int wheels, int stops, String destination) {
        super(name, wheels);
        this.stops = stops;
        this.destination = destination;
    }
    public int getStops() {
        return stops;
    }
    public String getDestination() {
        return destination;
    }
    public void stopAnnouncement() {
        System.out.println("This is a " + destination + " bound " + getName() + " train. The next stop is...");
    }
}
