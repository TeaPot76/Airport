import java.util.ArrayList;

public class Airport {
    private String code;
    private ArrayList<Hangar> hangars;

    public Airport(String code){
        this.code = code;
        this.hangars = new ArrayList<>();

    }

    public Airport(String code, ArrayList<Hangar> hangars) {
        this.code = code;
        this.hangars = hangars;
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
}
