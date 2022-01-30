package AwtBasic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TextAra extends Frame implements ActionListener
{
    TextArea ta;
    Button b;
    Label l;
    TextField tf;
    TextAra()
    {
        ta=new TextArea(10, 30);
        tf=new TextField(20);
        l=new Label("Nothing is entered yet");
        b=new Button("Click");
        setLayout(new FlowLayout());
b.addActionListener(this);
        add(ta);
        add(l);
        add(tf);
        add(b);
    }
    public void actionPerformed(ActionEvent ae)
    {
//            ta.setText(tf.getText());
//        ta.append(tf.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}
public class textArea {
    public static void main(String[] args) {


        TextAra t = new TextAra();
        t.setSize(500, 400);
        t.setVisible(true);
    }
}
