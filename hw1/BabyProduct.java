package HW.hw1;

public class BabyProduct extends Product {
    private Integer minAge;
    private String hypoallergenic;

    public BabyProduct(String title,Double price,Integer number,String unit,Integer minAge, String hypoallergenic){
        super(title, price, number, unit);
        this.minAge=minAge;
        this.hypoallergenic=hypoallergenic;

    }
    @Override
    public String toString() {
        return super.toString()+" Минимальный возраст : "+minAge+" Гипоаллергенность : "+hypoallergenic;
    }
}