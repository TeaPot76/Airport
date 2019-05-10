import java.util.ArrayList;

public class Plane {

    private Type type;
    private String airlineName;
    private ArrayList<Passenger> passengers;

    public Plane(Type type, String airlineName) {
        this.type = type;
        this.airlineName = airlineName;
        this.passengers = new ArrayList<>();
    }

    public Type getType() {
        return type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getPassengersSize() {
        return passengers.size();
    }

    public int capacity() {
        return type.getCapacity();
    }
}
