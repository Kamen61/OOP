package HW.hw2;

public abstract class WildAnimal extends Animal {
    private String habitat;
    private String discoveryDate;

    public WildAnimal(String height,String weight,String eyeColor,String voice,String habitat,String discoveryDate){
        super(height, weight, eyeColor, voice);
        this.habitat=habitat;
        this.discoveryDate=discoveryDate;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" Место обитания : %s , Дата нахождения : %s ",this.habitat, this.discoveryDate);
    }
}
