import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;

    @Before
    public void before(){
        plane = new Plane(Type.AIRBUS, "Destination");
        flight = new Flight("Warsaw", 234, plane);
    }

    @Test
    public void hasDestination(){
        assertEquals("Warsaw", flight.getDestination());
    }
    @Test
    public void hasFlightNumber(){
        assertEquals(234, flight.getFlightNumber());
    }
    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

}
