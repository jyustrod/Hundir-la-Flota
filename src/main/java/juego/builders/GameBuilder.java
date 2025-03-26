package juego.builders;

import juego.Player;

public class GameBuilder {
    private Player player1;
    private Player player2;

    public GameBuilder setPlayers(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
        return this;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
