import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;

    @Before
    public void Before() {
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink() {
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void emptyBottle() {
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }
    @Test
    public void fillBottle() {
        waterbottle.empty();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}
