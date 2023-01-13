package HW.hw1;

public class Eggs extends FoodProduct {
    private Integer quantity;

    public Eggs(String title,Double price,Integer number,String unit,String shelfLife,Integer quantity){
        super(title, price, number, unit, shelfLife);
        this.quantity=quantity;

    }
    @Override
    public String toString() {
        return super.toString()+" Количество в упаковке : "+quantity;
    }
}