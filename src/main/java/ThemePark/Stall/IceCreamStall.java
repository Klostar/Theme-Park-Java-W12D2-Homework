package ThemePark.Stall;

import ThemePark.Visitor;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName , int parkingSpaces){
        super(name, ownerName, parkingSpaces);
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
