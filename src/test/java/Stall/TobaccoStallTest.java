package Stall;

import ThemePark.Stall.TobaccoStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Tobys Tobacco", "Smokey Toby", 2);
    }

    @Test
    public void tobaccoStallHasName(){
        assertEquals("Tobys Tobacco", tobaccoStall.getName());
    }

    @Test
    public void tobaccoStallHasOwner(){
        assertEquals("Smokey Toby", tobaccoStall.getOwnerName());
    }

    @Test
    public void tobaccoStallHasParkingSpaces(){
        assertEquals(2, tobaccoStall.getParkingSpaces());
    }

    @Test
    public void testAgeCheck(){
        Visitor visitor = new Visitor(200 ,16,20.0);
        assertEquals(false , tobaccoStall.isAllowed(visitor));
    }
}
