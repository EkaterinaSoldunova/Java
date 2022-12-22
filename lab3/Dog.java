public abstract class Dog {
    protected String name;
    public Dog(){}
    public Dog(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    abstract public String getInfo();
    abstract public String toString();
}
