package ThemePark.Stall;

import ThemePark.ITicketed;

public abstract class Stall implements ITicketed {
    private String name;
    private String ownerName;
    private int parkingSpaces;

    public Stall(String name, String ownerName, int parkingSpaces){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpaces = parkingSpaces;
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


}
