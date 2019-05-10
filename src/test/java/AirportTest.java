import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class AirportTest {

    private Airport airport;
    private ArrayList<Hangar> hangars;
    private Hangar hangar;

    @Before
    public void before(){
        hangars = new ArrayList<>();
        airport = new Airport("EDI", hangars);
        hangar = new Hangar();


    }
    @Test
    public void hasCode(){
       assertEquals("EDI", airport.getCode());
    }
    @Test
    public void hasHangar(){
        assertEquals(null, airport.getHangars());
    }
    @Test
    public void hasNumberOfHangars(){
        airport.addHangar(hangar);
        assertEquals(1, airport.numberOfHangars());
    }



}
