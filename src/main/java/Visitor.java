public class Visitor {
    private int heightCm;
    private int age;
    private double money;

    public Visitor(int heightCm, int age , double money){
       this.heightCm = heightCm;
       this.age = age;
       this.money = money;

    }

    public int getHeight() {
        return heightCm;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }
}
