import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class AirportTest {

    private Airport airport;
    private ArrayList<Hangar> hangars;
    private Hangar hangar;
    private Plane plane;
    private ArrayList<Plane> flightPlanes;
    private Flight flight;
    private Passenger passenger;
    private ArrayList<Passenger> passengers;

    @Before
    public void before() {
        hangars = new ArrayList<>();
        airport = new Airport("EDI", hangars);
        hangar = new Hangar();
        plane = new Plane(Type.AIRBUS, "Jet");
        flightPlanes = new ArrayList<>();
        flight = new Flight("Warsaw", 345);
        passenger = new Passenger();
        passengers = new ArrayList<>();


    }

    @Test
    public void hasCode() {
        assertEquals("EDI", airport.getCode());
    }

    @Test
    public void hasHangar() {
        assertEquals(hangars, airport.getHangars());
    }

    @Test
    public void hasNumberOfHangars() {
        airport.addHangar(hangar);
        assertEquals(1, airport.numberOfHangars());
    }


    @Test
    public void canCreateFlight() {
        hangar.addPlane(plane);
        airport.addHangar(hangar);
        Flight expectedFlight = new Flight("DarkSideOfSoul", 123);
        expectedFlight.addPlane(plane);
        Flight darkSideOfSoul = airport.createFlight("DarkSideOfSoul", 123, plane);
        assertEquals(expectedFlight, darkSideOfSoul);
    }

    @Test
    public void cannotCreateFlightWhenPlaneDoesNotExist() {
        airport.addHangar(hangar);
        Flight expectedFlight = null;
        Flight darkSideOfSoul = airport.createFlight("DarkSideOfSoul", 123, plane);
        assertEquals(expectedFlight, darkSideOfSoul);
    }

    @Test
    public void canSellTicketForFlight() {
        Flight expectedFlight = new Flight("DarkSideOfSoul", 123);
        Ticket expectedTicket = new Ticket(expectedFlight);
        assertEquals(expectedTicket, airport.sellTicketForFlight(expectedFlight));
    }


}
