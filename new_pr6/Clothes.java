public class Clothes implements Priceable{
    private int price;
    public Clothes(){}
    public Clothes(int price){
        this.price=price;
    }
    @Override
    public String getPrice(){
        return "Price of clothes: "+price+" rub";
    }
}
