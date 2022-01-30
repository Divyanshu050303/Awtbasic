package AwtBasic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class textField extends Frame implements TextListener, ActionListener
{
    TextField tf;
    Label l1, l2;
    textField()
    {
        super("Text Field demo");
        l1=new Label("Anything is not entered yet");
        l2=new Label("Enter is not hit yet");
        tf=new TextField(20);
        tf.addTextListener(this);
        tf.addActionListener(this);
        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }

    @Override
    public void textValueChanged(TextEvent e) {
l1.setText(tf.getText());
    }
}


public class TextFields {
    public static void main(String[] args) {
        textField t=new textField();
        t.setSize(300, 300);
        t.setVisible(true);
    }
}
