package Stall;

import ThemePark.Stall.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Irenes Ices", "Carly Cream", 5);
    }

    @Test
    public void iceCreamStallHasName(){
        assertEquals("Irenes Ices", iceCreamStall.getName());
    }

    @Test
    public void iceCreamStallHasOwner(){
        assertEquals("Carly Cream", iceCreamStall.getOwnerName());
    }

    @Test
    public void iceCreamStallHasParkingSpaces(){
        assertEquals(5, iceCreamStall.getParkingSpaces());
    }
}
