import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel scentance1 = new  JLabel("Once upon a time");
    JLabel scentance2 = new JLabel("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    public JBookQuote()
    {
        super("Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(scentance1);
        add(scentance2);
    }
    public static void main(String[] args)
    {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(450, 200);
        aFrame.setVisible(true);
    }
}