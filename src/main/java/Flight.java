import java.util.Objects;

public class Flight {

    private String destination;
    private int flightNumber;
    private Plane flightPlane;

    public Flight(String destination, int flightNumber, Plane flightPlane) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightPlane = flightPlane;
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
