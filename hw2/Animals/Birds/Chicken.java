package HW.hw2.Animals.Birds;

public class Chicken extends FlyingBird {
    public Chicken(String height,String weight,String eyeColor,String voice,String habitat,String discoveryDate,String flightAltitude){
        super(height, weight, eyeColor, voice, habitat, discoveryDate, flightAltitude);
    }

    @Override
    public String fly() {
        return String.format("У %s , Высота полёта : %s ", "Chiken", this.flightAltitude);
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" , Высота полёта : %s ", this.flightAltitude);
    }
}
