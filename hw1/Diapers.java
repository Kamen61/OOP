package HW.hw1;

public class Diapers extends BabyProduct{

    private double size;
    private double minWeight;
    private double maxWeight;
    private String type;
    public Diapers(String title,Double price,Integer number,String unit,Integer minAge, String hypoallergenic,double size,double minWeight, double maxWeight,String type){
        super(title, price, number, unit, minAge, hypoallergenic);
        this.size=size;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
        this.type=type;
    }
    @Override
    public String toString() {
        return super.toString()+" Размер : "+size+" Минимальный вес : "+minWeight+" Максимальный вес : "+maxWeight+" Тип : "+type;
    }
}
