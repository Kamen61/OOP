package HW.hw1;

public class Milk extends FoodProduct {
    private double fat;

    public Milk(String title,Double price,Integer number,String unit,String shelfLife,double fat){
        super(title, price, number, unit, shelfLife);
        this.fat=fat;

    }
    @Override
    public String toString() {
        return super.toString()+" Процент жирности : "+fat;
    }
}