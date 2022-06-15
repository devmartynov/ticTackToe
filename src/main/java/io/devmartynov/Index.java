package io.devmartynov;

import io.devmartynov.controllers.GameController;
import io.devmartynov.models.Board;
import io.devmartynov.models.Figure;
import io.devmartynov.models.Player;
import io.devmartynov.views.ConsoleView;

public class Index {
    public static void main(String[] args) {
        Board board = new Board();
        GameController gameController = new GameController(
            "xo",
            new Player[]{
                new Player("Ivan", new Figure("x")),
                new Player("Denis", new Figure("o")),
            },
            board
        );
        ConsoleView consoleView = new ConsoleView(gameController);
        consoleView.showPlayers();
    }
}
