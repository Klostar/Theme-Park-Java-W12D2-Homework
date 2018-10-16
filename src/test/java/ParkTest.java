import ThemePark.Attraction.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("The Kings Trail Park");
    }

    @Test
    public void getParkName(){
        assertEquals("The Kings Trail Park", park.getName());
    }
}
