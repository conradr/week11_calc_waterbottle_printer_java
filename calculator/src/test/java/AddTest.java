import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {
    Calculator calculator;

    @Before

    public void Before() {
        calculator = new Calculator();

    }

    @Test
    public void canAdd() {
        assertEquals(4, calculator.add(2, 2) );
    }

    @Test
    public void canSubtract() {
        assertEquals(6, calculator.subtract(8, 2) );
    }

    @Test
    public void canMultiply() {
        assertEquals(12, calculator.multiply(2, 6) );
    }

    @Test
    public void canDivide() {
        assertEquals(1.8, calculator.divide(9, 5), 0.0 );
    }

}
