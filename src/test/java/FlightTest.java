import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private Plane flightPlane;

    @Before
    public void before() {
        flightPlane = new Plane(Type.AIRBUS, "Destination");
        flight = new Flight("Warsaw", 234, flightPlane);
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


}
