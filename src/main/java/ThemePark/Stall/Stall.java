package ThemePark.Stall;

import ThemePark.IReviewed;
import ThemePark.ITicketed;

public abstract class Stall implements ITicketed, IReviewed {
    private String name;
    private String ownerName;
    private int parkingSpaces;
    private int rating;

    public Stall(String name, String ownerName, int parkingSpaces, int rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpaces = parkingSpaces;
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getParkingSpaces(){
        return this.parkingSpaces;
    }

    public int getRating(){
        return this.rating;
    }

}
