package Attraction;

import ThemePark.Attraction.RollerCoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;


    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Steel Dragon");

    }

    @Test
    public void getRollerCoasterName(){
        assertEquals("Steel Dragon", rollerCoaster.getName());
    }

    @Test
    public void checkHeightLimit(){
        Visitor visitor = new Visitor(200,16,20.0);
        assertEquals(true, rollerCoaster.isAllowed(visitor));
        Visitor visitor2 = new Visitor(140,13,20.0);
        assertEquals(false, rollerCoaster.isAllowed(visitor2));
    }
}
