package juego;

import juego.builders.GameBuilder;
import juego.builders.ShipBuilder;
import juego.ships.Ship;
import juego.ships.ShipRegistry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShipBuilder shipBuilder = new ShipBuilder();
        GameBuilder gameBuilder = new GameBuilder();
        ShipRegistry registry = new ShipRegistry();

        System.out.print("Enter Player 1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Player 2 name: ");
        String name2 = scanner.nextLine();

        gameBuilder.setPlayers(name1, name2);
        Player player1 = gameBuilder.getPlayer1();
        Player player2 = gameBuilder.getPlayer2();

        System.out.println("Each player selects 3 ships.");
        for (int i = 0; i < 3; i++) {
            Ship ship1 = selectShip(scanner, shipBuilder, player1.getName());
            Ship ship2 = selectShip(scanner, shipBuilder, player2.getName());
            player1.addShip(ship1);
            player2.addShip(ship2);

            registry.registerShip(i + 1, ship1.getName() + "_P1", ship1.getName(), ship1);
            registry.registerShip(i + 4, ship2.getName() + "_P2", ship2.getName(), ship2);
        }

        System.out.println("Game starts!");
        while (player1.hasShips() && player2.hasShips()) {
            player1.attack(player2);
            player2.attack(player1);
        }

        if (!player1.hasShips() && !player2.hasShips()) {
            System.out.println("It's a draw!");
        } else if (player1.hasShips()) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }

    private static Ship selectShip(Scanner scanner, ShipBuilder builder, String playerName) {
        System.out.println(playerName + ", choose a ship: (1) Battleship, (2) Frigate, (3) Canoe");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                return builder.setBattleship().build();
            case 2:
                return builder.setFrigate().build();
            case 3:
                return builder.setCanoe().build();
            default:
                System.out.println("Invalid choice, selecting Canoe by default.");
                return builder.setCanoe().build();
        }
    }
}