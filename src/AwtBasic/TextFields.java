package AwtBasic;


import java.awt.*;



public class TextFields {

    TextFields()
    {


        Frame f;
        f=new Frame("TextField example");
        TextField t1, t2;
        t1=new TextField("Welcome to Divyanshu world");
        t1.setBounds(50, 100, 200, 30);
        t2=new TextField("AWT Basic");
        t2.setBounds(50, 150, 200, 30);
        f.add(t1);
        f.add(t2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
     new TextFields();
    }
}
