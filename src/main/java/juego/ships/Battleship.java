package juego.ships;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Battleship")
public class Battleship extends Ship {
    public Battleship() {
        this.name = "Battleship";
        this.size = 5;
    }
}