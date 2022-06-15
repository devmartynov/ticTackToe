package io.devmartynov.views;

import java.util.Scanner;

public class MenuView {
    private static final int START_GAME_CODE = 1;
    private static final int EXIT_CODE = 2;

    public void showMenuAndGetUserChoice() {
        System.out.println(START_GAME_CODE + " - Start");
        System.out.println(EXIT_CODE + " - Exit");

        Scanner scanner = new Scanner(System.in);

        var menuCode = scanner.nextInt();

        switch (menuCode) {
            case START_GAME_CODE: {
                // todo
            }

            case EXIT_CODE: {
                // todo
            }
        }
    }
}
