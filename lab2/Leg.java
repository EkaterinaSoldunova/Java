public class Leg {
    private int length;
    public Leg(int l) {
        length = l;
    }
    public void setLength(int l){
        length = l;
    }
    public int getLength(){
        return length;
    }
    public String toString(){
        return "length of leg: "+length;
    }
}
