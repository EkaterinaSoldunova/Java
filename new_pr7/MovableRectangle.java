public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public String toString(){
        return "topLeft ("+topLeft.toString()+"), bottomRight ("+bottomRight.toString()+")";
    }
    public boolean SpeedTest(){
        if (topLeft.xSpeed==bottomRight.xSpeed && topLeft.ySpeed==bottomRight.ySpeed) return true;
        else return false;
    }
    @Override
    public void moveUp(){
        if (SpeedTest()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else System.out.println("Error. Different speeds.");
    }
    @Override
    public void moveDown(){
        if (SpeedTest()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else System.out.println("Error. Different speeds.");
    }
    @Override
    public void moveLeft(){
        if (SpeedTest()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else System.out.println("Error. Different speeds.");
    }
    @Override
    public void moveRight(){
        if (SpeedTest()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else System.out.println("Error. Different speeds.");
    }
}
