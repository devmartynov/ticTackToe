package io.devmartynov.controllers;

import io.devmartynov.helpers.CoordinateHelper;
import io.devmartynov.models.Board;
import io.devmartynov.models.Player;

public class GameController {
    private final String gameName;

    private final Player[] players;

    private final Board board;

    public GameController(final String gameName, Player[] players, Board board) {
        this.gameName = gameName;
        this.players = players;
        this.board = board;
    }

    public boolean move(final int x, final int y) {
        if (CoordinateHelper.checkCoordinate(x) && CoordinateHelper.checkCoordinate(y)) {
            // todo move logic
            return true;
        }

        return false;
    }

    public Player getCurrentPlayer() {
        return null;
    }

    public String getGameName() {
        return gameName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }
}
