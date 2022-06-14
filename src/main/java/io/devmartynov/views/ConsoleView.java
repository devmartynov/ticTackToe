package io.devmartynov.views;

import io.devmartynov.controllers.Game;

import java.util.Arrays;

public class ConsoleView {
    private final Game game;

    ConsoleView(final Game game) {
        this.game = game;
    }

    public void showGameName() {
        System.out.println(game.getName());
    }

    public void showPlayersName() {
        System.out.println(Arrays.toString(game.getPlayers()));
    }
}
