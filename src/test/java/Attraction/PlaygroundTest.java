package Attraction;

import ThemePark.Attraction.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest  {
    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("Jungle Theme Playground",2);
        visitor = new Visitor(145,13,50.0);
    }

    @Test
    public void playgroundHasName(){
        assertEquals("Jungle Theme Playground", playground.getName());
    }

    @Test
    public void hasMaxAge(){
        assertEquals(true , playground.isAllowed(visitor));
    }

    @Test
    public void rejectAge(){
        Visitor visitor2 = new Visitor(200,20,40.0);
        assertEquals(false, playground.isAllowed(visitor2));
    }

    @Test
    public void getRating(){
        assertEquals(2, playground.getRating());
    }

}
