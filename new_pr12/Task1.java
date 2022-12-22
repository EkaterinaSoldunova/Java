import javax.swing.*;
import java.awt.*;

public class Task1 extends JFrame {
    public Task1() {
        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public Shape randShape(int i){
        int x=(int)(Math.random()*500);
        int y=(int)(Math.random()*500);
        Color color = new Color((int)(Math.random()*0x1000000));
        if (i==1) return new Circle(x,y,color);
        else if (i==2) return new Rectangle(x,y,color);
        else return new Star(x,y,color);
    }
    public void paint(Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        for (int i = 0;i<20;i++){
            Shape f = randShape((int)(Math.random()*3));
            f.draw(gr2d);
        }
    }
    public static void main(String[] args) {
        new Task1();
    }
}
