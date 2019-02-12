package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            int j = i + 1;
            if (data[i][j - 1] != data[i + 1][j]) {
                result = false;
                break;
            }

            if (data [i][data.length - j] != data [i + 1][data.length - j - 1]) {
                result = false;
                break;

            }
        }

        return result;
    }
}