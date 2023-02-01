package HW.hw2.Animals.Birds;

import HW.hw2.Animals.Wild.WildAnimal;

public abstract class Bird extends WildAnimal {
    
    public Bird(String height,String weight,String eyeColor,String voice,String habitat,String discoveryDate){
        super(height, weight, eyeColor, voice, habitat, discoveryDate);
    }

}
