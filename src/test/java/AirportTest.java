import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class AirportTest {

    private Airport airport;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;
    private Flight flight1;
    private Flight flight2;
    private Flight flight3;
    private Hangar hangar;
    private Plane plane1;
    private Plane plane2;
    private Plane plane3;

    private Passenger passenger;
    private ArrayList<Passenger> passengers;

    @Before
    public void before() {
        plane1 = new Plane(Type.AIRBUS, "Jet");
        plane2 = new Plane(Type.BOEING, "BA");
        plane3 = new Plane(Type.HELICOPTER, "Helipad");

        flight1 = new Flight("Warsaw", 345, plane1);
        flight2 = new Flight("Inverness", 346, plane2);
        flight3 = new Flight("Teneriffe", 347, plane3);
        hangar = new Hangar();
        hangar.addPlane(plane1);
        hangar.addPlane(plane2);
        hangar.addPlane(plane3);
        hangars = new ArrayList<>();
        hangars.add(hangar);
        flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        airport = new Airport("EDI", hangars, flights);
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
        assertEquals(2, airport.numberOfHangars());
    }


    @Test
    public void canCreateFlight() {

        Flight expectedFlight = new Flight("DarkSideOfSoul", 123, plane1);
        Flight darkSideOfSoul = airport.createFlight("DarkSideOfSoul", 123, plane1);
        assertEquals(expectedFlight, darkSideOfSoul);
    }

    @Test
    public void cannotCreateFlightWhenPlaneDoesNotExist() {
        Flight expectedFlight = null;
        Plane plane4 = new Plane(Type.EVERET, "Das");
        Flight darkSideOfSoul = airport.createFlight("DarkSideOfSoul", 123, plane4);
        assertEquals(expectedFlight, darkSideOfSoul);
    }

    @Test
    public void canSellTicketForFlight() {
        Ticket expectedTicket = new Ticket(flight1);
        assertEquals(expectedTicket, airport.sellTicketForFlight(flight1));
    }
    @Test
    public void canAddPassengersToFlight(){
        plane1.addPassenger(passenger);
        flight1.getPlane();
        assertEquals(1, airport.addPassengersToFlight(flight1));
    }
//
//    public void numberOfPassengersBookedPerFlight(){
//        assertEquals(2, airport.passengersPerFlight(passenger));
//    }


}
