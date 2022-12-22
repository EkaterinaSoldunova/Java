import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Task3 extends JFrame{
    public JLabel label;
    public Task3(){
        setSize(300, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        ImageIcon icon1 = new ImageIcon("src/icon.jpg");
        ImageIcon icon2 = new ImageIcon("src/original.jpg");
        label=new JLabel("",icon1,SwingConstants.CENTER);
        getContentPane().add(label);
        ActionListener animate = new ActionListener() {

            private int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index<2) {
                    index++;
                } else {
                    index = 0;
                }
                if (index==0){
                    label.setIcon(icon1);

                }
                else if(index == 1) {
                    label.setIcon(icon2);

                }
            }
        };
        Timer timer = new Timer(200,animate);
        timer.start();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Task3();
    }

}