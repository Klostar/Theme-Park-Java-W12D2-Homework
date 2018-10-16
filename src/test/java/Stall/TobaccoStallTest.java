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
        tobaccoStall = new TobaccoStall("Tobys Tobacco", "Smokey Toby", 2,1);
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
    @Test
    public void testVisitorAllowed(){
        Visitor visitor = new Visitor(200,20,20.0);
        assertEquals(true, tobaccoStall.isAllowed(visitor));
    }

    @Test
    public void hasPrice(){
        assertEquals(6.60, tobaccoStall.defaultPrice(),1);
    }

    @Test
    public void getRating(){
        assertEquals(1, tobaccoStall.getRating());
    }
}
