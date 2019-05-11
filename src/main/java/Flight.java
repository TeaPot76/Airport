import java.util.ArrayList;
import java.util.Objects;

public class Flight {

    private String destination;
    private int flightNumber;
    private ArrayList<Plane> flightPlane;

    public Flight(String destination, int flightNumber) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightPlane = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public ArrayList<Plane> getPlane() {
        return flightPlane;
    }

    public int planeSize() {
        return flightPlane.size();
    }

    public void addPlane(Plane plane) {
        this.flightPlane.add(plane);
    }

    public void removePlane(Plane plane) {
        this.flightPlane.remove(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber &&
                destination.equals(flight.destination) &&
                flightPlane.equals(flight.flightPlane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, flightPlane);
    }
}
