import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger;
    private ArrayList<Passenger> passengers;

    @Before
    public void before() {
        passengers = new ArrayList<>();
        plane = new Plane(Type.AIRBUS, "SunnyHoliday");
        passenger = new Passenger();

    }

    @Test
    public void hasType() {
        assertEquals(Type.AIRBUS, plane.getType());
    }

    @Test
    public void hasAirlineName() {
        assertEquals("SunnyHoliday", plane.getAirlineName());
    }

    @Test
    public void hasPassengers() {
        assertEquals(passengers, plane.getPassengers());
    }

    @Test
    public void hasPassengersSize() {
        assertEquals(0, plane.getPassengersSize());
    }

    @Test
    public void hasCapacity() {
        assertEquals(130, plane.capacity());
    }

    @Test
    public void canAddPassenger() {
        plane.addPassenger(passenger);
        assertEquals(1, plane.getPassengersSize());
    }

    @Test
    public void canRemovePassenger() {
        plane.addPassenger(passenger);
        plane.removePassenger(passenger);
        assertEquals(0, plane.getPassengersSize());
    }
}
