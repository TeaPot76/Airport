import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private ArrayList<Plane> flightPlane;

    @Before
    public void before() {
        flightPlane = new ArrayList<>();
        plane = new Plane(Type.AIRBUS, "Destination");
        flight = new Flight("Warsaw", 234);
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
    public void canAddPlane() {
        flight.addPlane(plane);
        assertEquals(1, flight.planeSize());
    }

    @Test
    public void canRemoevePlane() {
        flight.addPlane(plane);
        flight.removePlane(plane);
        assertEquals(0, flight.planeSize());
    }
}
