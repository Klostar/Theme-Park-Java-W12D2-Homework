import ThemePark.Attraction.Dodgems;
import ThemePark.Attraction.Playground;
import ThemePark.Attraction.RollerCoaster;
import ThemePark.Stall.CandyFlossStall;
import ThemePark.Stall.TobaccoStall;
import ThemePark.ThemePark;
import ThemePark.Visitor;
import ThemePark.IReviewed;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    CandyFlossStall candyFlossStall;
    RollerCoaster rollerCoaster;
    Dodgems dodgems;
    Visitor visitor;
    TobaccoStall tobaccoStall;
    Playground playground;



    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Chloes Cotton Candy", "Chloe Cotton", 3,5);
        rollerCoaster = new RollerCoaster("Hulk Smash",5);
        dodgems = new Dodgems("Bumper Cars", 2);
        tobaccoStall = new TobaccoStall("Smokeys", "SmokeyJoe", 4, 5);
        playground = new Playground("Dinosaur Playground", 4);


        ArrayList<IReviewed> reviews = new ArrayList<>();

        reviews.add(dodgems);
        reviews.add(tobaccoStall);

        themePark = new ThemePark("Thorpe Park", reviews);


    }

    @Test
    public void testGetAllReviewed() {
        assertEquals(2, themePark.getAllRevieweds().size());
    }

    @Test
    public void themeParkHasName(){
        assertEquals("Thorpe Park", themePark.getName());
    }

    @Test
    public void getNumberOfAttractions(){
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

//    @Test
//    public void reviewListStartsEmpty(){
//        assertEquals(0, themePark.reviewsCount());
//    }
//


}
