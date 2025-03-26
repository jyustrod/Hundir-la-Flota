package juego.ships;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Canoe")
public class Canoe extends Ship {
    public Canoe() {
        this.name = "Canoe";
        this.size = 1;
    }
}