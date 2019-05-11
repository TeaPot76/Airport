import java.util.ArrayList;

public class Hangar {
    private ArrayList<Plane> planes;

    public Hangar() {
        this.planes = new ArrayList<>();
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<Plane> planes) {
        this.planes = planes;
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

    public Plane getPlaneByPlaneType(Type type) {
        for (Plane plane : planes) {
            if (plane.getType() == type) {
                return plane;
            }
        }
        return null;
    }
}