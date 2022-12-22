public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "x: "+x+", y: "+y;
    }
    @Override
    public void moveUp(){
        y+=ySpeed;
    }
    @Override
    public void moveDown(){
        y-=ySpeed;
    }
    @Override
    public void moveLeft(){
        x-=xSpeed;
    }
    @Override
    public void moveRight(){
        x+=xSpeed;
    }
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(1,2,1,1);
        System.out.println(p);
        p.moveRight();
        p.moveUp();
        System.out.println(p);
    }
}
