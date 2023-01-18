package HW.hw2;

public class Bird extends WildAnimal {
    private String flightAltitude;
    
    public Bird(String height,String weight,String eyeColor,String voice,String habitat,String discoveryDate,String flightAltitude){
        super(height, weight, eyeColor, voice, habitat, discoveryDate);
        this.flightAltitude=flightAltitude;
    }
    public void fly(){
        System.out.println(String.format("Я лечу на %s метрах", this.flightAltitude));
    }
    @Override
    public String toString() {
        return super.toString()+String.format(" , Высота полёта : %s ", this.flightAltitude);
    }
}
