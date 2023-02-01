package HW.hw2.Animals.Petss;

import HW.hw2.Animals.Interface.Pet;
import HW.hw2.Animals.Interface.Trainer;

public class Dog extends Pets implements Pet,Trainer{
    private boolean trailing;

    public Dog(String height,String weight,String eyeColor,String voice,String name,String breed,String vaccines,String colorWool,String birthDate,boolean trailing){
        super(height, weight, eyeColor, voice, name, breed, vaccines, colorWool, birthDate);
        this.trailing=trailing;
    }

    public String train(){
        if (trailing==false){
            this.trailing=true;
            return "Собака уже отдрессирована";
        }
        else{
            return "Собака теперь отдрессирована";
        }
    }
    @Override
    public String toString() {
        return super.toString()+String.format(", Наличие дрессировка : %b ", this.trailing);
    }

    @Override
    public String caress() {
        return String.format("%s проявляет ласку ", this.name);
        
    }

    
}
