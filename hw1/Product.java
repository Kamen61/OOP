package HW.hw1;

public class Product {
    private String title;
    private double price;
    private int number;
    private String unit;

    public Product(String title,Double price,Integer number,String unit){
        this.title=title;
        this.price=price;
        this.number=number;
        this.unit=unit;
    }

    @Override
    public String toString() {
        return "Название продукта : "+title+", Цена : "+price+" руб , Кол-во : "+number+' '+unit;
    }
}
