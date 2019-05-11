import java.util.ArrayList;
import java.util.Objects;

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

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return type == plane.type &&
                airlineName.equals(plane.airlineName) &&
                passengers.equals(plane.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, airlineName, passengers);
    }
}
