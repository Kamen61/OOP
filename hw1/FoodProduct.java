package HW.hw1;

public class FoodProduct extends Product {
    private String shelfLife;

    public FoodProduct(String title,Double price,Integer number,String unit,String shelfLife){
        super(title, price, number, unit);
        this.shelfLife=shelfLife;

    }
    @Override
    public String toString() {
        return super.toString()+", Срок годности : "+shelfLife;
    }
}
