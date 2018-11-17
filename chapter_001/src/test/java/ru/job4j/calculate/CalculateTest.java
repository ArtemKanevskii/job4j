 package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * Class CalculateTest.
 * Тестирование вывода заданной строки в консоль.
 * @author Artem Kanevskii
 * @since 12.11.2018
 * @version 0.1
 */
 public class CalculateTest {
 /**
 * Test echo.
 */
@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Artem Kanevskii";
    String expect = "Echo, echo, echo : Artem Kanevskii"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}