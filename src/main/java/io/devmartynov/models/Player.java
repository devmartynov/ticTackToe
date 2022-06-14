package io.devmartynov.models;

public class Player {
    private final String name;

    private final Figure figure;

    Player(final String name, final Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return this.name;
    }

    public Figure getFigure() {
        return figure;
    }
}
