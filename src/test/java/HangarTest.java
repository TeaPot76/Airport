import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HangarTest {

    private Hangar hangar;
    private Plane plane;
    private ArrayList<Plane> planes;

    @Before
    public void before() {
        planes = new ArrayList<>();
        hangar = new Hangar();
        plane = new Plane(Type.AIRBUS, "SunnyTrip");

    }

    @Test
    public void hasPlane() {
        assertEquals(planes, hangar.getPlanes());
    }

    @Test
    public void hasSize() {
        assertEquals(0, hangar.numberOfPlanes());

    }

    @Test
    public void canAddPlane() {
        hangar.addPlane(plane);
        assertEquals(1, hangar.numberOfPlanes());
    }

    @Test
    public void canDispatchPlane() {
        hangar.addPlane(plane);
        hangar.dispatchPlane();
        assertEquals(0, hangar.numberOfPlanes());
    }

    @Test
    public void canGetPlaneByPlaneType() {
        hangar.addPlane(plane);
        Plane returnedPlane = hangar.getPlaneByPlaneType(Type.AIRBUS);
        assertEquals(Type.AIRBUS, returnedPlane.getType());
    }
}

