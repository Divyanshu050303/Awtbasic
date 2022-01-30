package AwtBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class list extends Frame implements ItemListener, ActionListener
{
    List l;
    Choice c;
    TextArea ta;
    list()
    {
        l=new List(7, true);
        c=new Choice();


        ta=new TextArea(20, 30);
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");
        add(l);
        add(c);
        add(ta);
        setLayout(new FlowLayout());
        l.addItemListener(this);
        l.addActionListener(this);
        c.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent ae)
    {
        if(ae.getSource()==l)
        {
            ta.setText(l.getSelectedItem());
        }
        else
        {
            ta.setText(c.getSelectedItem());
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        String List[]=l.getSelectedItems();
        String txt="";
        for (String st:List) {
            txt+=st+"\n";
        }
        ta.setText(txt);
    }
}

public class optionList {
    public static void main(String[] args) {
        list l=new list();
        l.setSize(400, 400);
        l.setVisible(true);
    }
}
