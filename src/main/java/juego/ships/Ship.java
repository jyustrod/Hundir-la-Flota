package juego.ships;

public abstract class Ship {
    protected String name;
    protected int size;
    protected int hits;

    public void hit() {
        hits++;
    }

    public boolean isSunk() {
        return hits >= size;
    }

    @Override
    public String toString() {
        return name + " (Size: " + size + ", Hits: " + hits + ")";
    }
}