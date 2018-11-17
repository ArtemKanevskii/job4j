package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubstract3Minus1Then2() {
        Calculator calc = new Calculator();
        calc.substract(3D,1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDiv3On1Then3() {
        Calculator calc = new Calculator();
        calc.div(3D,1D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultiple3On1Then3() {
        Calculator calc = new Calculator();
        calc.multiple(3D,1D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
}
