public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    public Human(int head, int leg, int hand){
        this.head = new Head(head);
        this.leg = new Leg(leg);
        this.hand = new Hand(hand);
    }
    public String toString(){
        return head+", "+leg+", "+hand;
    }
}
