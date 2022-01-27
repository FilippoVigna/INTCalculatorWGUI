package com.Phil.CalculatorWGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame{
    private JButton buttonPlus;
    private JButton buttonDiv;
    private JButton buttonMinus;
    private JButton buttonMult;
    private JPanel Maine;
    private JLabel LabelResult;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a4Button;
    private JButton a0Button;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton buttonEqual;
    private JButton clearButton;
    private JButton a12Button;
    private JButton squareButton;
    private JButton button2;
    private JButton squareRootButton;
    private double a;
    private double b;
    private double c = 0;
    private double r;
    private String t;

    number n = new number();

    public Screen() {
        super("Calculator");
        this.setContentPane(this.Maine);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = n.getA();
                n.setA(0);
                c = 1;
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = n.getA();
                n.setA(0);
                c = 2;
            }
        });

        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = n.getA();
                n.setA(0);
                c = 3;
            }
        });

        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = n.getA();
                n.setA(0);
                c = 4;
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Digit(1);
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Digit(2);
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Digit(3);
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Digit(4);
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Digit(5);
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Digit(6);
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Digit(7);
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Digit(8);
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Digit(9);
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Digit(0);
            }
        });

        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = n.getA();

                if (c == 1) {
                    r = a + b;
                    t = Double.toString(r);
                    LabelResult.setText(t);
                }
                else if (c == 2) {
                    if (a >= b) {
                        r = a - b;
                        t = Double.toString(r);
                        LabelResult.setText(t);
                    }
                    else {
                        r = b - a;
                        t = Double.toString(r);
                        LabelResult.setText("- " + t);
                    }
                }
                else if (c == 3) {
                    r = a * b;
                    t = Double.toString(r);
                    LabelResult.setText(t);
                }
                else if (c == 4) {
                    r = a / b;
                    t = Double.toString(r);
                    LabelResult.setText(t);
                }
                else if (c == 5){
                    LabelResult.setText("12 is not an operation, choose a real one");
                }
                else
                    LabelResult.setText(t = Double.toString(n.getA()));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RESET();
            }
        });

        a12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = n.getA();
                n.setA(0);
                c = 5;
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = n.getA();
                b = a;
               for (int i = 1; i < a ; i++) {
                   b = b * (a - i);
               }
               r = b;
               t = Double.toString(r);
               LabelResult.setText(t);
            }
        });

        squareRootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = n.getA();
                r = Math.sqrt(a);
                t = Double.toString(r);
                LabelResult.setText(t);
            }
        });
        squareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = n.getA();
                r = Math.pow(a,2);
                t = Double.toString(r);
                LabelResult.setText(t);
            }
        });
    }

    public void RESET () {
        n.setA(0);
        a = 0.0;
        b= 0.0;
        c = 0;
        LabelResult.setText("0.0");
    }

    public void Digit (double Key) {
        n.addDigit(Key);
        t = Double.toString(n.getA());
        LabelResult.setText(t);
    }


    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setVisible(true);
    }

}
