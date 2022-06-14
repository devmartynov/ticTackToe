package io.devmartynov.controllers;

import io.devmartynov.models.Player;

public class Game {
    private final String GAME_NAME = "XO";

    private final Player[] players;

    Game(Player[] players) {
        this.players = players;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y) {
        return false;
    }

    public String getName() {
        return GAME_NAME;
    }

    public Player[] getPlayers() {
        return players;
    }
}
