import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Task2 extends JFrame {
    String[] country = {"Australia", "China", "England", "Russia"};
    JComboBox comboBox = new JComboBox(country);
    public Task2() {

        setSize(400,400);
        setLayout(new FlowLayout());
        add(comboBox);

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (comboBox.getSelectedItem().equals("Australia")) {
                    JOptionPane.showMessageDialog(null, "Australia, the smallest continent and one of the largest countries on Earth.");
                }
                else if (comboBox.getSelectedItem().equals("China")) {
                    JOptionPane.showMessageDialog(null, "China is a country in East Asia.");
                }
                else if (comboBox.getSelectedItem().equals("England")) {
                    JOptionPane.showMessageDialog(null, "England is a country that is part of the United Kingdom.");
                }
                else if (comboBox.getSelectedItem().equals("Russia")) {
                    JOptionPane.showMessageDialog(null, "Russia is a transcontinental country spanning Eastern Europe and Northern Asia.");
                }
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[]args) {
        new Task2();
    }
}