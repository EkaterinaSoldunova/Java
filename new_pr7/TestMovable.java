public class TestMovable {
    public static void main(String[] args) {
        System.out.println("Test MovablePoint:");
        MovablePoint p = new MovablePoint(1,2,1,1);
        System.out.println(p);
        p.moveRight();
        p.moveUp();
        System.out.println(p+"\n");

        System.out.println("Test MovableRectangle:");
        MovableRectangle p3 = new MovableRectangle(1,2,1,1, 5, 6);
        System.out.println(p3);
        p3.moveRight();
        p3.moveUp();
        System.out.println(p3);
    }
}
