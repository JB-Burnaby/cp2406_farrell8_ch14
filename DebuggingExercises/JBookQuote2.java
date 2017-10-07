import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel scentance1 = new  JLabel("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    JLabel scentance2 = new JLabel("Once upon a time");
    JButton button = new JButton("Click for source");
    JLabel scentance3 = new JLabel("Sugar we're going down swinging");
    public JBookQuote2()
    {
        super("Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(scentance1);
        add(scentance2);
        add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(scentance3);
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(450, 200);
        aFrame.setVisible(true);
    }
}