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
    private Flight flight4;

    private Hangar hangar;
    private Plane plane1;
    private Plane plane2;
    private Plane plane3;
    private Plane plane6;

    private Passenger passenger;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Passenger passenger6;
    private Passenger passenger7;

    private ArrayList<Passenger> passengers;

    @Before
    public void before() {
        plane1 = new Plane(Type.AIRBUS, "Jet");
        plane2 = new Plane(Type.BOEING, "BA");
        plane3 = new Plane(Type.HELICOPTER, "Helipad");
        plane6 = new Plane(Type.HELICOPTER, "Das");

        flight1 = new Flight("Warsaw", 345, plane1);
        flight2 = new Flight("Inverness", 346, plane2);
        flight3 = new Flight("Teneriffe", 347, plane3);
        flight4 = new Flight("Teneriffe", 123, plane6);

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
        flights.add(flight4);
        airport = new Airport("EDI", hangars, flights);
        passenger = new Passenger("Dod");
        passengers = new ArrayList<>();
        passenger1 = new Passenger("Dod");
        passenger2 = new Passenger("Dod");
        passenger3 = new Passenger("Dod");
        passenger4 = new Passenger("Dod");
        passenger5 = new Passenger("Dod");
        passenger6 = new Passenger("Dod");
        passenger7 = new Passenger("Dod");



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
        Plane plane6 = new Plane(Type.EVERET, "Das");
        Passenger passenger1 = new Passenger("Dod");
        Ticket expectedTicket = new Ticket(flight1);
        int flightNumber = 345;
        airport.addPassengerToFlight(flightNumber, passenger1);
        assertEquals(expectedTicket, airport.sellTicketForFlight(flightNumber));
    }
    @Test
    public void canNotSellTicketForFlight() {

        Ticket expectedTicket= new Ticket(flight4);
        int flightNumber = 123;
        airport.addPassengerToFlight(flightNumber, passenger1);
        airport.addPassengerToFlight(flightNumber, passenger2);
        airport.addPassengerToFlight(flightNumber, passenger3);
        airport.addPassengerToFlight(flightNumber, passenger4);
        airport.addPassengerToFlight(flightNumber, passenger5);
        airport.addPassengerToFlight(flightNumber, passenger6);
       airport.addPassengerToFlight(flightNumber, passenger7);

        assertEquals(null, airport.sellTicketForFlight(flightNumber));
    }

    @Test
    public void canAddPassengersToFlight() {
        Passenger passenger1 = new Passenger("Bob");
        int flightNumber = 346;
        airport.addPassengerToFlight(flightNumber, passenger1);
        assertEquals(1, plane2.getPassengersSize());
        assertEquals(passenger1, plane2.getPassengers().get(0));
        assertEquals(1, airport.passengerCountForFlightNumber(flightNumber));

    }

    @Test
    public void cannotAddPassengersFlightDoesNotExists() {
        Passenger passenger1 = new Passenger("Bob");
        int flightNumber = 349;
        airport.addPassengerToFlight(flightNumber, passenger1);
        assertEquals(0, airport.passengerCountForFlightNumber(flightNumber));

    }


}
