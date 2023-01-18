package HW.hw2;

public abstract class Animal {
    private String height;
    private String weight;
    private String eyeColor;
    private String voice;

    public Animal(String height,String weight,String eyeColor,String voice){
        this.height=height;
        this.weight=weight;
        this.eyeColor=eyeColor;
        this.voice=voice;
    }

    public void sound(){
        System.out.println(this.voice);
    }

    @Override
    public String toString() {
        return String.format("Рост : %s , Вес : %s , Цвет глаз : %s ,", this.height,this.weight,this.eyeColor);
    }
 
}
