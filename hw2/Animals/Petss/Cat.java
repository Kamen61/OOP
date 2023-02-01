package HW.hw2.Animals.Petss;

import HW.hw2.Animals.Interface.Pet;

public class Cat extends Pets implements Pet{
    private boolean wool;

    @Override
    public String toString() {
        return super.toString()+String.format(" , Наличие шерсти : %b", this.wool);
    }

    public Cat(String height,String weight,String eyeColor,String voice,String name,String breed,String vaccines,String colorWool,String birthDate,boolean wool){
        super(height,weight,eyeColor,voice,name,breed,vaccines,colorWool,birthDate);
        this.wool=wool;
    }

    @Override
    public String caress() {
        return String.format("%s проявляет ласку ", this.name);
        
    }
}
