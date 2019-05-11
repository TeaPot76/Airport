import java.util.ArrayList;

public class Airport {
    private String code;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;

    public Airport(String code) {
        this.code = code;
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();

    }

    public Airport(String code, ArrayList<Hangar> hangars, ArrayList<Flight> flights) {
        this.code = code;
        this.hangars = hangars;
        this.flights = flights;
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

    public int addPassengersToFlight( Flight flight) {
        return flight.getPlane().getPassengersSize();

      }

//
//    public int passengersPerFlight(Passenger passenger){
//        Passenger passengers = new ArrayList<Passenger>();
//        passengers.add(passenger);
//        return passengers.size();
//    }

}

