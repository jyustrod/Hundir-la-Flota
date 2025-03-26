package juego;

import juego.ships.Ship;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private String name;
    private List<Ship> ships;

    public Player(String name) {
        this.name = name;
        this.ships = new ArrayList<>();
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public boolean attack(Player opponent) {
        Random random = new Random();
        if (opponent.ships.isEmpty()) return false;

        Ship target = opponent.ships.get(random.nextInt(opponent.ships.size()));
        target.hit();
        System.out.println(name + " ha atacado al barco " + target.getName() + " de " + opponent.name);

        if (target.isSunk()) {
            System.out.println(target.getName() + " se ha hundido!");
            opponent.ships.remove(target);
        }
        return true;
    }

    public boolean hasShips() {
        return !ships.isEmpty();
    }

    public String getName() {
        return name;
    }
}
