import java.util.Objects;

public class Ticket {
    private Flight flight;

    public Ticket(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return flight.equals(ticket.flight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flight);
    }
}
