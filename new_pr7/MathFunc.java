public class MathFunc implements MathCalculable{
    @Override
    public int mathDegree(int x){
        return x*x;
    }
    @Override
    public double mathModule(int x, int y){
        return Math.sqrt(x*x+y*y);
    }
    public double circleLength(int r){
        return 2*PI*r;
    }
}
