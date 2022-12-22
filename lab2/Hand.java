public class Hand {
    private int length;
    public Hand(int l) {
        length = l;
    }
    public void setLength(int l){
        length = l;
    }
    public int getLength(){
        return length;
    }
    public String toString(){
        return "length of hand: "+length;
    }
}
