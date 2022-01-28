package AwtBasic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Buttons extends Frame
{
   Buttons()
   {
       addWindowListener (new WindowAdapter() {
           public void windowClosing (WindowEvent e) {
               dispose();
           }
       });
       final TextField tf=new TextField();
       add(tf).setBounds(50, 100, 100, 40);
//       Label l=new Label("Button demo");
//       add(l);
       Button button1, button2, button3;
       button1=new Button("Tata");
       button2=new Button("Welcome");
       button3=new Button();
       button3.setLabel("Hello");

       setLayout(null);
       button1.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         tf.setText("Tata ");
                                     }
                                 }
       );
       button2.addActionListener(
               new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       tf.setText("Welcome");
                   }
               }
       );
       button3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               tf.setText("Hello");
           }
       });
       add(button1).setBounds(100, 200, 60, 40);
       add(button2).setBounds(160, 200, 60, 40);
       add(button3).setBounds(210, 200, 60, 40);
       setSize(400, 400);
       setVisible(true);

   }

    public static void main(String[] args) {
new Buttons();
    }
}
