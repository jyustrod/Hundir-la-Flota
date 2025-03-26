package juego.registry;

import juego.ships.Ship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipRegistry {
    private Map<String, List<Ship>> typeRegistry;
    private Map<Integer, Ship> numberRegistry;
    private Map<String, Ship> nameRegistry;

    public ShipRegistry() {
        this.typeRegistry = new HashMap<>();
        this.numberRegistry = new HashMap<>();
        this.nameRegistry = new HashMap<>();
    }

    public void registerShip(int number, String name, String type, Ship ship) {
        typeRegistry.putIfAbsent(type, new ArrayList<>());
        typeRegistry.get(type).add(ship);
        numberRegistry.put(number, ship);
        nameRegistry.put(name, ship);
    }

    public Ship getByNumber(int number) {
        return numberRegistry.get(number);
    }

    public Ship getByName(String name) {
        return nameRegistry.get(name);
    }

    public List<Ship> getByType(String type) {
        return typeRegistry.getOrDefault(type, new ArrayList<>());
    }
}
