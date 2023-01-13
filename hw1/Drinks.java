package HW.hw1;

public class Drinks extends Product {
    private int volume;

    public Drinks(String title,Double price,Integer number,String unit,Integer volume){
        super(title, price, number, unit);
        this.volume=volume;

    }

    @Override
    public String toString() {
        return super.toString()+" Объем "+volume;
    }
}