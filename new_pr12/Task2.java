import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame{
    public Task2() {
        setSize(300, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon("src/icon.jpg");
        getContentPane().add(new JLabel(icon));
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Task2();
    }
}
