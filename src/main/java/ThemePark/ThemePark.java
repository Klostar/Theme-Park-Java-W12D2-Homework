package ThemePark;

import ThemePark.Attraction.Attraction;
import ThemePark.Stall.Stall;



import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction>attractions;
    private ArrayList<Stall>stalls;
    private String name;

    public ThemePark(String name){
        this.name = name;
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();


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
}
