package ThemePark.Stall;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpaces){
        super(name, ownerName, parkingSpaces);
    }

    public boolean isAllowed(Visitor visitor){
        if(visitor.getAge()< 18 ){
            return false;
        }
        else{
            return true;
        }
    }


}
