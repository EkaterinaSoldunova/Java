public class Pug extends Dog{
    protected String colorWool;
    public Pug(){}
    public Pug(String c){
        this.colorWool = c;
    }
    public Pug(String c, String n){
        this.colorWool = c;
        this.name=n;
    }
    public void setColor(String c){
        this.colorWool=c;
    }
    public String getColor(){
        return colorWool;
    }
    @Override
    public String getInfo(){
        return "Pugs are small dogs";
    }
    @Override
    public String toString(){
        return "Dog's name: "+name+", color of wool: "+colorWool;
    }
}
