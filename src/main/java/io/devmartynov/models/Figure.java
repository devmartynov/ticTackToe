package io.devmartynov.models;

public class Figure {
    private final String figure;

    public Figure(final String figureName) {
        this.figure = figureName;
    }

    public String getContent() {
        return figure;
    }

    @Override
    public String toString() {
        return figure;
    }
}
