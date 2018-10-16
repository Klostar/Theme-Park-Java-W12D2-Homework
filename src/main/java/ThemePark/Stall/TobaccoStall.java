package ThemePark.Stall;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpaces, int rating){
        super(name, ownerName, parkingSpaces,rating);
    }

    public boolean isAllowed(Visitor visitor){
        if(visitor.getAge()< 18 ){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public double defaultPrice() {
        return 6.60;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }

}
