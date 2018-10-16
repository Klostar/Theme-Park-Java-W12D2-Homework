package Attraction;

import ThemePark.Attraction.Dodgems;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Bumper Cars", 2);
    }

    @Test
    public void getDodgemsName(){
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasprice(){
        assertEquals(4.50, dodgems.defaultPrice(),1);
    }
    @Test
    public void halfPrice(){
        Visitor visitor = new Visitor(200,10,20.0);
        assertEquals(2.25, dodgems.priceFor(visitor),1);
    }
    @Test
    public void getRating(){
        assertEquals(2, dodgems.getRating());
    }

}
