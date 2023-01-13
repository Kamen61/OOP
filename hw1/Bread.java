package HW.hw1;

public class Bread extends FoodProduct {
    private String typeOfFlour;

    public Bread(String title,Double price,Integer number,String unit,String shelfLife,String typeOfFlour){
        super(title, price, number, unit, shelfLife);
        this.typeOfFlour=typeOfFlour;

    }
    @Override
    public String toString() {
        return super.toString()+", Тип муки : "+typeOfFlour;
    }
}