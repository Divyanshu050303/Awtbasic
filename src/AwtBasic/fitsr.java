package AwtBasic;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class fitsr extends Frame {
    fitsr(){
        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                dispose();
            }
        });
        setSize(300, 300);
        setVisible(true);
        Label l=new Label("Name is divyanshu");
    }
    public static void main(String[] args) {
        fitsr f=new fitsr();

    }
}
