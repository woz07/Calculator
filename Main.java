import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField output = new JTextField();
    JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton times = new JButton("x");
    JButton divide = new JButton("÷");
    JButton equal = new JButton("=");
    JButton clear = new JButton("C");
    JButton sqrtRoot = new JButton("√");
    JButton getAns = new JButton("get last");
    String num2 = "";
    String num1 = "";
    String ans = "";
    Boolean addBtn = false;
    Boolean minusBtn = false;
    Boolean timesBtn = false;
    Boolean divideBtn = false;
    Boolean sqrtBtn = false;
    public Calculator() {
        setSize(300, 310);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel);
        b0.setPreferredSize(new Dimension(50, 50));
        b0.setBackground(Color.white);
        b1.setPreferredSize(new Dimension(50, 50));
        b1.setBackground(Color.white);
        b2.setPreferredSize(new Dimension(50, 50));
        b2.setBackground(Color.white);
        b3.setPreferredSize(new Dimension(50, 50));
        b3.setBackground(Color.white);
        b4.setPreferredSize(new Dimension(50, 50));
        b4.setBackground(Color.white);
        b5.setPreferredSize(new Dimension(50, 50));
        b5.setBackground(Color.white);
        b6.setPreferredSize(new Dimension(50, 50));
        b6.setBackground(Color.white);
        b7.setPreferredSize(new Dimension(50, 50));
        b7.setBackground(Color.white);
        b8.setPreferredSize(new Dimension(50, 50));
        b8.setBackground(Color.white);
        b9.setPreferredSize(new Dimension(50, 50));
        b9.setBackground(Color.white);
        plus.setPreferredSize(new Dimension(50, 50));
        plus.setBackground(Color.white);
        minus.setPreferredSize(new Dimension(50, 50));
        minus.setBackground(Color.white);
        times.setPreferredSize(new Dimension(50, 50));
        times.setBackground(Color.white);
        divide.setPreferredSize(new Dimension(50, 50));
        divide.setBackground(Color.white);
        equal.setPreferredSize(new Dimension(50, 50));
        equal.setBackground(Color.white);
        clear.setPreferredSize(new Dimension(50, 50));
        clear.setBackground(Color.white);
        output.setPreferredSize(new Dimension(240, 40));
        output.setBackground(Color.white);
        sqrtRoot.setPreferredSize(new Dimension(50, 50));
        sqrtRoot.setBackground(Color.white);
        getAns.setPreferredSize(new Dimension(100, 50));
        getAns.setBackground(Color.white);

        panel.add(output);
        panel.add(b0);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(plus);
        panel.add(minus);
        panel.add(times);
        panel.add(divide);
        panel.add(equal);
        panel.add(clear);
        panel.add(sqrtRoot);
        panel.add(getAns);

        getAns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn) {
                    if (!minusBtn) {
                        if (!timesBtn) {
                            if (!divideBtn) {
                                num1 = ans;
                                output.setText(num1);
                            } else {
                                num2 = ans;
                                output.setText(num2);
                            }
                        } else {
                            num2 = ans;
                            output.setText(num2);
                        }
                    } else {
                        num2 = ans;
                        output.setText(num2);
                    }
                } else {
                    num2 = ans;
                    output.setText(num2);
                }
            }
        });

        sqrtRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sqrtBtn = true;
                addBtn = false;
                minusBtn  = false;
                timesBtn = false;
                divideBtn = false;
                output.setText("");
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBtn = true;
                minusBtn  = false;
                timesBtn = false;
                divideBtn = false;
                sqrtBtn = false;
                output.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minusBtn = true;
                timesBtn = false;
                addBtn = false;
                divideBtn = false;
                sqrtBtn = false;
                output.setText("");
            }
        });

        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timesBtn = true;
                minusBtn = false;
                addBtn = false;
                divideBtn = false;
                sqrtBtn = false;
                output.setText("");
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divideBtn = true;
                addBtn = false;
                minusBtn = false;
                timesBtn = false;
                sqrtBtn = false;
                output.setText("");
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addBtn) {
                    output.setText(String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2)));
                    ans = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
                }
                if (minusBtn) {
                    output.setText(String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2)));
                    ans = String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
                }
                if (timesBtn) {
                    output.setText(String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2)));
                    ans = String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
                }
                if (divideBtn) {
                    output.setText(String.valueOf(Double.parseDouble(num1) /  Double.parseDouble(num2)));
                    ans = String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
                }
                if (sqrtBtn) {
                    output.setText(String.valueOf(Math.sqrt(Double.parseDouble(num1))));
                    ans = String.valueOf(Math.sqrt(Double.parseDouble(num1)));
                }

                num1 = "";
                num2 = "";
                addBtn = false;
                minusBtn = false;
                timesBtn = false;
                divideBtn = false;
                sqrtBtn = false;
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText("");
                num1 = "";
                num2 = "";
                addBtn = false;
                minusBtn = false;
                timesBtn = false;
                divideBtn = false;
                sqrtBtn = false;
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "0";
                    output.setText(num1);
                } else {
                    num2 += "0";
                    output.setText(num2);
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "1";
                    output.setText(num1);
                } else {
                    num2 += "1";
                    output.setText(num2);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "2";
                    output.setText(num1);
                } else {
                    num2 += "2";
                    output.setText(num2);
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "3";
                    output.setText(num1);
                } else {
                    num2 += "3";
                    output.setText(num2);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "4";
                    output.setText(num1);
                } else {
                    num2 += "4";
                    output.setText(num2);
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "5";
                    output.setText(num1);
                } else {
                    num2 += "5";
                    output.setText(num1);
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "6";
                    output.setText(num1);
                } else {
                    num2 += "6";
                    output.setText(num2);
                }
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "7";
                    output.setText(num1);
                } else {
                    num2 += "7";
                    output.setText(num2);
                }
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "8";
                    output.setText(num1);
                } else {
                    num2 += "8";
                    output.setText(num2);
                }
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addBtn && !minusBtn && !timesBtn && !divideBtn) {
                    num1 += "9";
                    output.setText(num1);
                } else {
                    num2 += "9";
                    output.setText(num2);
                }
            }
        });
    }

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ignore) {

        }
    }

    public static void main(String[] args) {
        setLookAndFeel();
        Calculator calc = new Calculator();
    }
}
