package io.devmartynov.helpers;

public class CoordinateHelper {

    private static final int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = 3;

    public static boolean checkCoordinate(final int coordinate) {
        return coordinate > MIN_COORDINATE && coordinate <= MAX_COORDINATE;
    }

}
