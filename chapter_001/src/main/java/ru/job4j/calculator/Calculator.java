package ru.job4j.calculator;
/**
 * Class Calculator
 *
 * Элементарный калькулятор c автоматическим тестированием.
 * @author Artem Kanevskii
 * @since 17.11.2018
 * @version 0.1
 */
public class Calculator {
    private double result;

    void add(double first, double second) {
        this.result = first + second;
    }

    void substract(double first, double second) {
        this.result = first - second;
    }

    void div(double first, double second) {
        this.result = first / second;
    }

    void multiple(double first, double second) {
        this.result = first / second;
    }
    public double getResult() {
        return this.result;
    }

}
