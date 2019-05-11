import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Airport {
    private String code;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;
    private Map<Integer, Integer> flightCount;

    public Airport(String code, ArrayList<Hangar> hangars, ArrayList<Flight> flights) {
        this.code = code;
        this.hangars = hangars;
        this.flights = flights;
        this.flightCount = new HashMap<>();
    }


    public String getCode() {
        return code;
    }

    public ArrayList<Hangar> getHangars() {
        return hangars;
    }


    public int numberOfHangars() {
        return this.hangars.size();
    }

    public void addHangar(Hangar hangar) {
        this.hangars.add(hangar);


    }

    public Flight createFlight(String destination, int flightNumber, Plane plane) {
        boolean foundPlane = false;
        Flight flight = new Flight(destination, flightNumber, plane);
        for (Hangar hangar : this.hangars) {
            if (hangar.getPlanes().contains(plane)) {
                flight.getPlane();
                foundPlane = true;
            }
        }
        if (foundPlane) {
            return flight;
        } else {
            return null;
        }
    }


    public Ticket sellTicketForFlight(Flight flight) {
        return new Ticket(flight);
    }


    public void addPassengerToFlight(int flightNumber, Passenger passenger) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                flight.getPlane().addPassenger(passenger);
                if (flightCount.containsKey(flightNumber)) {
                    int currentCount = flightCount.get(flightNumber);
                    flightCount.put(flightNumber, currentCount + 1);
                } else {
                    flightCount.put(flightNumber, 1);
                }

            }

        }
    }

    public int passengerCountForFlightNumber(int flightNumber) {
        return flightCount.getOrDefault(flightNumber, 0);
    }
}

