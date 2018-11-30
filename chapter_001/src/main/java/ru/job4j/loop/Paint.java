package ru.job4j.loop;

/**
 * @author Artem Kanevskii
 * @version 0.1
 * @since 30.11.2018
 */
public class Paint {
    /**
     * Строит пирамиду в псевдографике из символа ^ и пробелов.
     * @param height - высота пирамиды.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}

