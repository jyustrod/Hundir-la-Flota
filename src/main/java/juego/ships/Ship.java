package juego.ships;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ship_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String name;
    protected int size;
    protected int hits = 0;

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

    public String getName() {
        return name;
    }
}
