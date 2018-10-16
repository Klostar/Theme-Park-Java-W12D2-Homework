package Stall;

import ThemePark.Stall.TobaccoStall;
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
        assertEquals("Smokey Joe", tobaccoStall.getOwnerName());
    }

    @Test
    public void tobaccoStallHasParkingSpaces(){
        assertEquals(2, tobaccoStall.getParkingSpaces());
    }
}
