package Attraction;

import ThemePark.Attraction.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;


    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Steel Dragon");

    }

    @Test
    public void getRollerCoasterName(){
        assertEquals("Steel Dragon", rollerCoaster.getName());
    }
}