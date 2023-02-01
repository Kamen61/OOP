package HW.hw2.Animals.Birds;

import HW.hw2.Animals.Interface.Flier;

public abstract class FlyingBird extends Bird implements Flier{
    protected String flightAltitude;

    public FlyingBird(String height, String weight, String eyeColor, String voice, String habitat,
            String discoveryDate,String flightAltitude) {
        super(height, weight, eyeColor, voice, habitat, discoveryDate);
        this.flightAltitude=flightAltitude;
    }

    @Override
    public String fly() {
        return null;
    }

    
}
