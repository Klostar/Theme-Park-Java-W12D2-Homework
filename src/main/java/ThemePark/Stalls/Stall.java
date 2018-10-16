package ThemePark.Stalls;

public abstract class Stall {
    private String name;
    private String ownerName;
    private int parkingSpaces;

    public Stall(String name, String ownerName, int parkingSpaces){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpaces = parkingSpaces;
    }


}
