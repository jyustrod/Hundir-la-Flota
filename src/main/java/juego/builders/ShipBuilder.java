package juego.builders;

import juego.ships.Battleship;
import juego.ships.Canoe;
import juego.ships.Frigate;
import juego.ships.Ship;

public class ShipBuilder {
    private Ship ship;

    public ShipBuilder setBattleship() {
        this.ship = new Battleship();
        return this;
    }

    public ShipBuilder setFrigate() {
        this.ship = new Frigate();
        return this;
    }

    public ShipBuilder setCanoe() {
        this.ship = new Canoe();
        return this;
    }

    public Ship build() {
        return ship;
    }
}