public class Husky extends Dog{
    protected String colorEyes;
    public Husky(){}
    public Husky(String c){
        this.colorEyes = c;
    }
    public Husky(String c, String n){
        this.colorEyes = c;
        this.name = name;
    }
    public void setColor(String c){
        this.colorEyes=c;
    }
    public String getColor(){
        return colorEyes;
    }
    @Override
    public String getInfo(){
        return "Huskies are very friendly dogs";
    }
    @Override
    public String toString(){
        return "Dog's name: "+name+", color of eyes: "+colorEyes;
    }
}
