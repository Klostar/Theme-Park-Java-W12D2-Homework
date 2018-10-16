package ThemePark.Stall;

import ThemePark.Visitor;

public class CandyFlossStall extends Stall {

    public CandyFlossStall(String name, String ownerName,int parkingSpaces, int rating){
        super(name,ownerName,parkingSpaces,rating);

    }

    @Override
    public double defaultPrice() {
        return 4.20;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }



}
