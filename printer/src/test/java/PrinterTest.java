import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void Before() {
        printer = new Printer(10);
    }

    @Test
    public void hasPaper() {
        assertEquals(10, printer.getPaperLeft());
    }

    @Test
    public void canPrint() {
        printer.print(2,2);
        assertEquals(6, printer.getPaperLeft());
    }
    @Test
    public void notEnoughPaper() {
        printer.print(6,2);
        assertEquals(-2, printer.getPaperLeft());
    }
}
