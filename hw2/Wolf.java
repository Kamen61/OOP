package HW.hw2;

public class Wolf extends WildAnimal{
    private boolean leader;

    public Wolf(String height,String weight,String eyeColor,String voice,String habitat,String discoveryDate,boolean leader){
        super(height, weight, eyeColor, voice, habitat, discoveryDate);
        this.leader=leader;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" , Вожак стаи : %b ", this.leader);
    }

}
