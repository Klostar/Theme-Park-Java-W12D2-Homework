package ThemePark.Attraction;

import ThemePark.IReviewed;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed, IReviewed {

    public Dodgems(String name,int rating){
        super(name,rating);

    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge()< 12){
            return 2.25;
        }
        else return defaultPrice();
    }

    public int getRating(){
        return 2;
    }

}
