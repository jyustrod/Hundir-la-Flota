package juego.ships;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Frigate")
public class Frigate extends Ship {
    public Frigate() {
        this.name = "Frigate";
        this.size = 3;
    }
}