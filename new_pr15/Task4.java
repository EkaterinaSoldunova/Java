import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Task4 extends JFrame {
    JTextField text = new JTextField(10);
    JPanel[] pnl = new JPanel[5];
    int a = 0, b = 0;
    double c = 0, d = 0;
    String s = "", s1="", s2="";
    JButton b1 = new JButton("7");
    JButton b2 = new JButton("8");
    JButton b3 = new JButton("9");
    JButton b4 = new JButton("/");
    JButton b5 = new JButton("4");
    JButton b6 = new JButton("5");
    JButton b7 = new JButton("6");
    JButton b8 = new JButton("*");
    JButton b9 = new JButton("1");
    JButton b10 = new JButton("2");
    JButton b11 = new JButton("3");
    JButton b12 = new JButton("-");
    JButton b13 = new JButton("0");
    JButton b14 = new JButton(".");
    JButton b15 = new JButton("=");
    JButton b16 = new JButton("+");

    public Task4() {
        setSize(400,400);
        setLayout(new GridLayout(5,1));
        for (int i=0; i<pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[0].setLayout(null);
        pnl[0].add(text).setBounds(20,10,350,30);
        pnl[1].setLayout(new FlowLayout());
        pnl[1].add(b1);
        pnl[1].add(b2);
        pnl[1].add(b3);
        pnl[1].add(b4);
        pnl[2].add(b5);
        pnl[2].add(b6);
        pnl[2].add(b7);
        pnl[2].add(b8);
        pnl[3].add(b9);
        pnl[3].add(b10);
        pnl[3].add(b11);
        pnl[3].add(b12);
        pnl[4].add(b13);
        pnl[4].add(b14);
        pnl[4].add(b15);
        pnl[4].add(b16);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "7";
                text.setText(s);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "8";
                text.setText(s);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "9";
                text.setText(s);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "4";
                text.setText(s);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "5";
                text.setText(s);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "6";
                text.setText(s);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "1";
                text.setText(s);
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "2";
                text.setText(s);
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "3";
                text.setText(s);
            }
        });
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "0";
                text.setText(s);
            }
        });
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += ".";
                s2 = ".";
                text.setText(s);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!s2.equals(".")) a = Integer.parseInt(text.getText());
                    else c = Double.parseDouble(text.getText());
                    s1 = "/";
                    text.setText(s1);
                }catch (Exception exception) {
                    JOptionPane.showMessageDialog( null, "Ошибка в числе!","Внимание" , JOptionPane.ERROR_MESSAGE);
                    text.setText("");
                }
                s = "";
                s2 = "";
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!s2.equals(".")) a = Integer.parseInt(text.getText());
                    else c = Double.parseDouble(text.getText());
                    s1 = "*";
                    text.setText(s1);
                }catch (Exception exception) {
                    JOptionPane.showMessageDialog( null, "Ошибка в числе!","Внимание" , JOptionPane.ERROR_MESSAGE);
                    text.setText("");
                }
                s = "";
                s2 = "";
            }
        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!s2.equals(".")) a = Integer.parseInt(text.getText());
                    else c = Double.parseDouble(text.getText());
                    s1 = "-";
                    text.setText(s1);
                }catch (Exception exception) {
                    JOptionPane.showMessageDialog( null, "Ошибка в числе!","Внимание" , JOptionPane.ERROR_MESSAGE);
                    text.setText("");
                }
                s = "";
                s2 = "";
            }
        });
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!s2.equals(".")) a = Integer.parseInt(text.getText());
                    else c = Double.parseDouble(text.getText());
                    s1 = "+";
                    text.setText(s1);
                }catch (Exception exception) {
                    JOptionPane.showMessageDialog( null, "Ошибка в числе!","Внимание" , JOptionPane.ERROR_MESSAGE);
                    text.setText("");
                }
                s = "";
                s2 = "";
            }
        });
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a == 0 && c == 0) {
                    JOptionPane.showMessageDialog( null, "Не введено второе число!","Внимание" , JOptionPane.ERROR_MESSAGE);
                    text.setText("");
                }
                else {
                    try {
                        if (!s2.equals(".")) b = Integer.parseInt(text.getText());
                        else d = Double.parseDouble(text.getText());

                        String res;
                        if (s1.equals("/")) {
                            if (b == 0 && d == 0) {
                                JOptionPane.showMessageDialog(null, "На ноль делить нельзя!", "Внимание", JOptionPane.ERROR_MESSAGE);
                                text.setText("");
                            } else {
                                if (a != 0) {
                                    if (b != 0) res = Double.toString(a / b);
                                    else res = Double.toString(a / d);
                                }
                                else {
                                    if (b != 0) res = Double.toString(c / b);
                                    else res = Double.toString(c / d);
                                }
                                text.setText(res);
                            }
                        }
                        else if (s1.equals("+")) {
                            if (a != 0) {
                                if (b != 0) res = Integer.toString(a + b);
                                else res = Double.toString(a + d);
                            }
                            else {
                                if (b != 0) res = Double.toString(c + b);
                                else res = Double.toString(c + d);
                            }
                            text.setText(res);
                        }
                        else if (s1.equals("-")) {
                            if (a != 0) {
                                if (b != 0) res = Integer.toString(a - b);
                                else res = Double.toString(a - d);
                            }
                            else {
                                if (b != 0) res = Double.toString(c - b);
                                else res = Double.toString(c - d);
                            }
                            text.setText(res);
                        }
                        else if (s1.equals("*")) {
                            if (a != 0) {
                                if (b != 0) res = Integer.toString(a * b);
                                else res = Double.toString(a * d);
                            }
                            else {
                                if (b != 0) res = Double.toString(c * b);
                                else res = Double.toString(c * d);
                            }
                            text.setText(res);
                        }
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Ошибка в числе!", "Внимание", JOptionPane.ERROR_MESSAGE);
                        text.setText("");
                    }
                }
                s = "";
                s1 = "";
                s2 = "";
                a = b = 0;
                c = d = 0;
            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Task4();
    }
}