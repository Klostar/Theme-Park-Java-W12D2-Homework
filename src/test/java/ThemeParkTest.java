import ThemePark.Attraction.RollerCoaster;
import ThemePark.Stall.CandyFlossStall;
import ThemePark.ThemePark;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    CandyFlossStall candyFlossStall;
    RollerCoaster rollerCoaster;
    Visitor visitor;


    @Before
    public void before(){
        themePark = new ThemePark("Thorpe Park");
        candyFlossStall = new CandyFlossStall("Chloes Cotton Candy", "Chloe Cotton", 3,5);
        rollerCoaster = new RollerCoaster("Hulk Smash",5);

    }

    @Test
    public void themeParkHasName(){
        assertEquals("Thorpe Park", themePark.getName());
    }

    @Test
    public void getNumberofAttractions(){
        assertEquals(0, themePark.getAttractions());
    }

    @Test
    public void addAttractionToThemePark(){
        themePark.addAttraction(rollerCoaster);
        assertEquals(1, themePark.getAttractions());
    }

    @Test
    public void getNumberOfStalls(){
        assertEquals(0, themePark.getStalls());
    }

    @Test
    public void addStallToThemePark(){
        themePark.addStall(candyFlossStall);
        assertEquals(1, themePark.getStalls());
    }

    @Test
    public void addVisit(){
        assertEquals("ThemePark.Visitor Visited :Hulk Smash", themePark.visit(visitor,rollerCoaster));

    }
}
