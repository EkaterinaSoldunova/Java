import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Matches extends JFrame{
    public int milan = 0;
    public int madrid = 0;
    JButton b1 = new JButton("AC Milan");
    JButton b2 = new JButton("Real Madrid");
    JButton b3 = new JButton("The end of match");
    JLabel l1 = new JLabel("Result: 0 X 0");
    JLabel l2 = new JLabel("Last Scorer: N/A");
    JLabel l3 = new JLabel("Winner:");
    public Matches(){
        setLayout(null);
        setSize(400,400);
        b1.setBounds(50,50,150,50);
        b2.setBounds(200,50,150,50);
        l1.setBounds(160,100,150,50);
        l2.setBounds(160,150,150,50);
        l3.setBounds(160,250,150,50);
        b3.setBounds(120,200,150,50);

        setVisible(true);
        add(b1);
        add(b2);
        add(l1);
        add(l2);
        add(l3);
        add(b3);
        b1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                milan++;
                l1.setText("Result: "+milan+" X "+madrid);
                l2.setText("Last Scorer: AC Milan");
            }
        });
        b2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                madrid++;
                l1.setText("Result: "+milan+" X "+madrid);
                l2.setText("Last Scorer: Real Madrid");
            }
        });
        b3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                if (milan>madrid) {
                    l3.setText("Winner: AC Milan");
                }
                else if (madrid>milan) {
                    l3.setText("Winner: Real Madrid");
                }
                else {
                    l3.setText("Winner: DRAW");
                }
            }
        });

    }
    public static void main(String[] args) {
        new Matches();
    }
}
