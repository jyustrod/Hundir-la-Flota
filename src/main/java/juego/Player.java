package juego;

import juego.ships.Ship;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ship> ships = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public Player() {}

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public boolean attack(Player opponent) {
        Random random = new Random();
        if (opponent.ships.isEmpty()) return false;

        Ship target = opponent.ships.get(random.nextInt(opponent.ships.size()));
        target.hit();
        System.out.println(name + " attacked " + opponent.name + "'s " + target.getName());

        if (target.isSunk()) {
            System.out.println(target.getName() + " has been sunk!");
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
