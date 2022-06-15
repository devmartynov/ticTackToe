package io.devmartynov.views;

import io.devmartynov.controllers.GameController;
import io.devmartynov.models.Board;
import io.devmartynov.models.Player;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {
    private static final char LINE_DELIMITER = '-';
    private static final int LINE_DELIMITER_SIZE = 6;
    private static final char COL_DELIMITER = '|';

    private static final int MAX_ATTEMPT_COUNT = 3;
    protected final GameController gameController;

    public ConsoleView(final GameController gameController) {
        this.gameController = gameController;
    }

    public void start() {
        System.out.println("Please enter the coordinates");
        int x = getCoordinate("x");
        int y = getCoordinate("y");
    }

    public void showGameName() {
        System.out.println(gameController.getGameName());
    }

    public void showPlayers() {
        for (Player player : gameController.getPlayers()) {
            System.out.println(player.getName() + " figure: " + player.getFigure().getContent());
        }
    }

    public void showBoard() {
        for (var line = 0; line < Board.BOARD_SIZE; line++) {
            showBoardLine(line);
            printLineDelimiter(LINE_DELIMITER, LINE_DELIMITER_SIZE);
        }
    }

    private void showBoardLine(final int lineIndex) {
        for (var colIndex = 0; colIndex < Board.BOARD_SIZE; colIndex++) {
            System.out.print(
                gameController.getBoard().getFigure(lineIndex, colIndex).getContent()
            );
            printColDelimiter(COL_DELIMITER);
        }
        System.out.println();
    }

    private void printColDelimiter(final char symbol) {
        System.out.print(symbol);
    }

    private void printLineDelimiter(final char symbol, final int size) {
        for (var i = 0; i < size; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    private int getCoordinate(final String coordinateName) {
        var attemptCount = 0;

        do {
            System.out.printf("Input the coordinate %s%n", coordinateName);

            try {
                final Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (final InputMismatchException e) {
                System.out.println("Coordinate is incorrect!");
                attemptCount++;
            }
        } while (attemptCount < MAX_ATTEMPT_COUNT);

        return -1;
    }
}
