package HW.hw1;

public class Hygiene extends Product{
    private int numberOfPieces;;

    public Hygiene(String title,Double price,Integer number,String unit,Integer numberOfPieces){
        super(title, price, number, unit);
        this.numberOfPieces=numberOfPieces;

    }
    @Override
    public String toString() {
        return super.toString()+" Кол-во в упаковке : "+numberOfPieces;
    }
}