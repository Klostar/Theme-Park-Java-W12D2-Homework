package Stall;

import ThemePark.Stall.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Cotton Candy Clouds", "Fluffy Joe", 4, 3);

    }

    @Test
    public void CandyFlossStallHasName(){
        assertEquals("Cotton Candy Clouds", candyFlossStall.getName());
    }

    @Test
    public void CandyFlossStallHasOwner(){
        assertEquals("Fluffy Joe", candyFlossStall.getOwnerName());
    }

    @Test
    public void CandyFlossStallHasParkingSpaces(){
        assertEquals(4, candyFlossStall.getParkingSpaces());
    }

    @Test
    public void hasPrice(){
        assertEquals(4.20, candyFlossStall.defaultPrice(),1);
    }

    @Test
    public void getRating(){
        assertEquals(3, candyFlossStall.getRating());
    }
}
