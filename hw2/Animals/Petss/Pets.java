package HW.hw2.Animals.Petss;

import HW.hw2.Animals.Base.Animal;

public abstract class Pets extends Animal {
    public String name;
    private String breed;
    private String vaccines;
    private String colorWool;
    private String birthDate;

    public Pets(String height,String weight,String eyeColor,String voice,String name,String breed,String vaccines,String colorWool,String birthDate){
        super(height, weight, eyeColor, voice);
        this.name=name;
        this.breed=breed;
        this.vaccines=vaccines;
        this.colorWool=colorWool;
        this.birthDate=birthDate;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" Имя : : %s , Порода : %s , Вакцины : %s ,"+
        " Цвет шерсти : %s , День рождения : %s", this.name,this.breed,this.vaccines,this.colorWool,this.birthDate);
    }

}