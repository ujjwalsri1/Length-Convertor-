import java.awt.*;

import java.awt.event.*;

public class convertor{

 

           public static void convertor()

           {
                Frame f = new Frame("CONVERTER");
                f.setBackground(Color.RED);
                Label l1, l2;
                TextField t1, t2;
                Button b1, b2, b3;
                l1 = new Label("centimeters:");
                l1.setBackground(Color.RED);
                l1.setBounds(20, 40, 60, 30);
                l2 = new Label("Meters:");
                l2.setBackground(Color.RED);
                l2.setBounds(170, 40, 60, 30);
                t1 = new TextField("");
                t1.setBounds(80, 40, 50, 30);
                t2 = new TextField("");
                t2.setBounds(240, 40, 50, 30);
                b1 = new Button("Centimeter");
                b1.setBounds(50, 80, 60, 15);
                b1.setBackground(Color.RED);
                b2 = new Button("Meter");
                b2.setBackground(Color.RED);
                b2.setBounds(190, 80, 60, 15);
                b3 = new Button("close");
                b3.setBackground(Color.RED);
                b3.setBounds(150, 150, 60, 30);
                b1.addActionListener(new ActionListener() {

                                 public void actionPerformed(ActionEvent e)

                                 {
                                    double d= Double.parseDouble(t1.getText());
                                    double d1 =(d /100 );

                                    String str1 = String.valueOf(d1);

                                    t2.setText(str1);

                                 }

                });
                b2.addActionListener(new ActionListener() {

                                 public void actionPerformed(ActionEvent e)

                                 {

                                           

                                    double d2= Double.parseDouble(t2.getText());

                                    double d3 = (d2 * 100);

                                    String str2 = String.valueOf(d3);

                                    t1.setText(str2);

                                 }

                });

 

                     

                b3.addActionListener(new ActionListener() {

                                 public void actionPerformed(ActionEvent e)

                                 {

                                            f.dispose();

                                 }

                      });

 

          

                      f.addWindowListener(new WindowAdapter() {

                                 public void windowClosing(WindowEvent e)

                                 {

                                            System.exit(0);

                                 }

                      });

 

                     

                      f.add(l1);

                      f.add(t1);

                      f.add(l2);

                      f.add(t2);

                      f.add(b1);

                      f.add(b2);

                      f.add(b3);

 

                      f.setLayout(null);

                      f.setSize(400, 300);

                      f.setVisible(true);

           }

 

 

           public static void main(String args[])

           {

                      convertor();

           }

}