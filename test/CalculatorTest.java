import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldAddNumbers() {
        assertThat(calc.add(1, 2), is(3.0));
    }

    @Test
    public void shouldMultiplyNumbers() {
        assertThat(calc.mult(2, 3), is(6.0));
    }

    @Test
    public void shouldAddDecimalPoints() {
        assertThat(calc.add(1.57, 2.44), is(4.01));
    }

    @Test
    public void shouldMultiplyDecimalPointsAndRoundToTwoDigits() {
        assertThat(calc.mult(1.57, 2.44), is(3.83));
    }

    @Test
    public void shouldMultiplyDecimalPoints() {
        assertThat(calc.mult(2.6, 3.9), is(10.14));
    }

    @Test
    public void shouldMultiplyAgainstRandomNumber() {
        assertThat(calc.multRandom(5), is(50.0));
    }
}