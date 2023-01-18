package HW.hw2;

public abstract class Pet extends Animal{
    private String name;
    private String breed;
    private String vaccines;
    private String colorWool;
    private String birthDate;

    public Pet(String height,String weight,String eyeColor,String voice,String name,String breed,String vaccines,String colorWool,String birthDate){
        super(height, weight, eyeColor, voice);
        this.name=name;
        this.breed=breed;
        this.vaccines=vaccines;
        this.colorWool=colorWool;
        this.birthDate=birthDate;
    }
    public void caress(){
        System.out.println(String.format("%s проявлять ласку.", this.name));
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" Имя : : %s , Порода : %s , Вакцины : %s ,"+
        " Цвет шерсти : %s , День рождения : %s", this.name,this.breed,this.vaccines,this.colorWool,this.birthDate);
    }

}