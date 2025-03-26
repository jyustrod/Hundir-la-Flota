package juego;

import juego.builders.ShipBuilder;
import juego.ships.Ship;

public class Main {
    public static void main(String[] args) {
        ShipBuilder builder = new ShipBuilder();
        Ship battleship = builder.setBattleship().build();
        Ship frigate = builder.setFrigate().build();
        Ship canoe = builder.setCanoe().build();

        System.out.println(battleship);
        System.out.println(frigate);
        System.out.println(canoe);
    }
}