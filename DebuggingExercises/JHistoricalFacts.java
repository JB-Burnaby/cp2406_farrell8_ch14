import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton b = new JButton("Press to change fact");
    JLabel buffer = new JLabel("###################################################");
    JLabel f1 = new JLabel("the number 1 has always been less than 2");
    JLabel f2 = new JLabel("Water is heavier than air");
    JLabel f3 = new JLabel("We cannot breathe dirt");
    JLabel f4 = new JLabel("Java is better than python");
    JLabel f5 = new JLabel("And C");

    int counter = 0;
    public JHistoricalFacts()
    {
        super("Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(b);
        add(buffer);
        add(f1);
        b.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JHistoricalFacts rFrame = new JHistoricalFacts();
        rFrame.setSize(400,200);
        rFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        if(counter == 5)
            counter = 0;
        if(counter == 1)
        {
            remove(f1);
            add(f2);
        }
        else
        if(counter == 2)
        {
            remove(f2);
            add(f3);
        }
        else
        if(counter == 3)
        {
            remove(f3);
            add(f4);
        }
        else
        if(counter == 4)
        {
            remove(f4);
            add(f5);
        }
        else
        {
            remove(f5);
            add(f1);
        }

        validate();
        repaint();
    }

}