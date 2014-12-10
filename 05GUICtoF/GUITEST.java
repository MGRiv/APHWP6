import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUITEST extends JFrame implements ActionListener{
    private Container pane;
    private JButton c,f;
    private JTextField t;

    public GUITEST(){
	this.setTitle("Temperature Conversion");
	this.setSize(600, 200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	
	t = new JTextField(10);
	c = new JButton("Celcius");
	f = new JButton("Fahrenheit");

	c.setActionCommand("Converttoc");
	c.addActionListener(this);
	f.setActionCommand("Converttof");
	f.addActionListener(this);

	pane.add(t);
	pane.add(c);
	pane.add(f);
    }
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if(action.equals("Converttof")){
	    int temp;
	    String s = t.getText();
	    temp = Integer.parseInt(s);
	    t.setText(Integer.toString(((temp * 9) / 5) + 32));
	}
	if(action.equals("Converttoc")){
	    int temp;
	    String s = t.getText();
	    temp = Integer.parseInt(s);
	    t.setText(Integer.toString(((temp - 32) * 5) / 9));
	}
    }
    public static void main(String[] args){
	GUITEST q = new GUITEST();
	q.setVisible(true);
    }
}
