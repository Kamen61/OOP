package HW.hw2;

public class Dog extends Pet {
    private boolean trailing;

    public Dog(String height,String weight,String eyeColor,String voice,String name,String breed,String vaccines,String colorWool,String birthDate,boolean trailing){
        super(height, weight, eyeColor, voice, name, breed, vaccines, colorWool, birthDate);
        this.trailing=trailing;
    }

    public void train(){
        if (trailing==false){
            this.trailing=true;
            System.out.println("Собака теперь отдрессирована");
        }
        else{
            System.out.println("Собака уже отдрессирована");
        }
    }
    @Override
    public String toString() {
        return super.toString()+String.format(", Наличие дрессировка : %b ", this.trailing);
    }
}
