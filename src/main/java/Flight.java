import java.util.ArrayList;

public class Flight {
    private String destination;
    private int flightNumber;
    private Plane plane;

    public Flight(String destination, int flightNumber, Plane plane) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.plane = plane;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }
}
