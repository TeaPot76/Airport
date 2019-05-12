import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private Plane flightPlane;
    private Passenger passenger1;

    @Before
    public void before() {
        flightPlane = new Plane(Type.AIRBUS, "Destination");
        flight = new Flight("Warsaw", 234, flightPlane);
        passenger1 = new Passenger("Edwin");
    }

    @Test
    public void hasDestination() {
        assertEquals("Warsaw", flight.getDestination());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals(234, flight.getFlightNumber());
    }

    @Test
    public void hasPlane() {
        assertEquals(flightPlane, flight.getPlane());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengersSize());
    }
}
