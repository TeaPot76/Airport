public enum Type {

    BOEING (150),
    JET (120),
    AIRBUS(130),
    TURBOPROP(60),
    HELICOPTER(6),
    RENTON(110),
    EVERET(100);

    private final int capacity;
    Type(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
