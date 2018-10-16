package ThemePark.Attraction;

import ThemePark.ISecurity;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name){
        super(name);
    }

    public boolean isAllowed(Visitor visitor){
        if(visitor.getHeight() < 145 ){
            return false;
        }
        else return true;
    }

}
