import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUITEST extends JFrame implements ActionListener{
    private Container pane;
    private JButton c,f;
    private JTextField t;

    public Window(){
	this.setTitle("Temperature Conversion");
	this.setSize(600, 200);
	this.setLocation(100,100);
	this.setdefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	
	t = new JTextField(10);
	c = new JButton("Celcius");
	f = new JButton("Fahrenheit");
	pane.add(t);
	pane.add(c);
	pane.add(f);
    }
    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
    }
}