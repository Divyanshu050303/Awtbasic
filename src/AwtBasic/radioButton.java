package AwtBasic;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class checkRadio extends Frame implements ItemListener
{
    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup chg;

    checkRadio()
    {
        super("Check Box");

        l=new Label("Nothing is selected");

        chg=new CheckboxGroup();

        c1=new Checkbox("Java", true, chg);
        c2=new Checkbox("Python", false, chg);
        c3=new Checkbox("C", false, chg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";
        if(c1.getState())
            str=str+" "+c1.getLabel();
        if(c2.getState())
            str=str+" "+c2.getLabel();
        if(c3.getState())
            str=str+" "+c3.getLabel();
        if(str.isEmpty())
            str="Nothing is selected";

        l.setText(str);

    }
}
public class radioButton {
    public static void main(String[] args) {
        checkRadio c=new checkRadio();
        c.setSize(400, 400);
        c.setVisible(true);
    }

}