package io.devmartynov.models;

import io.devmartynov.helpers.CoordinateHelper;

import java.util.Arrays;

public class Board {
    public static final int BOARD_SIZE = 3;

    private static final String EMPTY_FIGURE = "";

    private Figure[][] figures = new Figure[BOARD_SIZE][BOARD_SIZE];

    public Board() {
        for (var figure : figures) {
            Arrays.fill(figure, new Figure("o"));
        }
    }

    public Figure getFigure(final int x, final int y) throws Error {
        if (CoordinateHelper.checkCoordinate(x) && CoordinateHelper.checkCoordinate(y)) {
            return figures[x][y];
        }

        return null;
    }

    public boolean setFigure(int x, int y) {
        if (CoordinateHelper.checkCoordinate(x)
            && CoordinateHelper.checkCoordinate(y)
            && !figures[x][y].getContent().equals(EMPTY_FIGURE)
        ) {
            return true;
        }

        return false;
    }
}
