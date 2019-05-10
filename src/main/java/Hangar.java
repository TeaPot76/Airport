import java.util.ArrayList;

public class Hangar {
    private ArrayList<Plane>planes;

    public Hangar(){
        this.planes = new ArrayList<>();
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public int numberOfPlanes() {
        return planes.size();
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void dispatchPlane() {
        planes.remove(0);
    }
}
