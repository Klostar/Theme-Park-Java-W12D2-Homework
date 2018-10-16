package ThemePark;

import ThemePark.Attraction.Attraction;
import ThemePark.Stall.Stall;



import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction>attractions;
    private ArrayList<Stall>stalls;
    private String name;
//    private Visitor visitor;


    public ThemePark(String name){
        this.name = name;
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
//        this.visitor = visitor;


    }

    public String getName() {
        return this.name;
    }

    public int getAttractions() {
        return attractions.size();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public int getStalls() {
        return stalls.size();
    }

    public void addStall(Stall stall) {
        stalls.add(stall);
    }


    public String visit(Visitor visitor, Attraction attraction) {
        return "ThemePark.Visitor Visited :" + attraction.getName();
    }
}