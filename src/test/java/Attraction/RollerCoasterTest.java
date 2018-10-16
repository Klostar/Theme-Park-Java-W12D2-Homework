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
        rollerCoaster = new RollerCoaster("Steel Dragon",5);

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
        Visitor visitor3 = new Visitor(140,10,20.0);
        assertEquals(false , rollerCoaster.isAllowed(visitor3));
        Visitor visitor4 = new Visitor(146,10,20.0);
        assertEquals(false, rollerCoaster.isAllowed(visitor4));
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(),1);
    }

    @Test
    public void chargeDouble(){
        Visitor visitor = new Visitor(201, 20,30.0);
        assertEquals(16.80, rollerCoaster.priceFor(visitor),1);
    }
}
