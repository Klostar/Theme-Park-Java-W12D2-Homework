package ThemePark.Attraction;

public abstract class Attraction {

    private String name;
    private int rating;

    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public int getRating(){
        return this.rating;
    }

    public String getName(){
        return this.name;
    }

}
