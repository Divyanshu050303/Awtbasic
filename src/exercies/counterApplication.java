package exercies;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class counter extends Frame implements ActionListener
{
    int count=0;
    Label l;
    Button b;
    counter()
    {
        super("Counter Application");
        b=new Button("Click");
        l=new Label("    "+count);
        setLayout(new FlowLayout());

        add(l);
        add(b);

b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("   "+count);

    }
}
public class counterApplication {
    public static void main(String[] args) {
        counter c=new counter();
        c.setSize(300, 300);
        c.setVisible(true);
    }
}
