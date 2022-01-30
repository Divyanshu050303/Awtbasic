package AwtBasic;

import java.awt.*;


class border extends Frame

{
    Button b1,b2, b3, b4, b5, b6;
    border()
    {
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b6=new Button("Four");
        b4=new Button("Five");
        b5=new Button("Six");
        setLayout(new GridLayout(3, 2));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);


    }
}

public class borderLayout {
    public static void main(String[] args) {
        border b=new border();
        b.setSize(300, 300);
        b.setVisible(true);
    }
}

