package HW.hw1;

public class ToiletPaper extends Hygiene{
    private Integer quantityOfLayers;
    
    public ToiletPaper(String title,Double price,Integer number,String unit,Integer numberOfPieces,Integer quantityOfLayers){
        super(title, price, number, unit, numberOfPieces);
        this.quantityOfLayers=quantityOfLayers;

    }
}