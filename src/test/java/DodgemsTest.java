import ThemePark.Attraction.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Bumper Cars");
    }

    @Test
    public void getDodgemsName(){
        assertEquals("Bumper Cars", dodgems.getName());
    }
}
