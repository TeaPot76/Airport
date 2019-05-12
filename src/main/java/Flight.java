import java.util.ArrayList;
import java.util.Objects;

public class Flight {


    private String destination;
    private int flightNumber;
    private Plane flightPlane;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, int flightNumber, Plane flightPlane) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightPlane = flightPlane;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public Plane getPlane() {
        return flightPlane;

    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
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

    public int getPassengersSize() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void setFlightPlane(Plane flightPlane) {
        this.flightPlane = flightPlane;
    }
}
