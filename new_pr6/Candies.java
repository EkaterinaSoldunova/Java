public class Candies implements Priceable{
    private int price;
    public Candies(){}
    public Candies(int price){
        this.price=price;
    }
    @Override
    public String getPrice(){
        return "Price of candies: "+price+" rub";
    }
}
