import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

class JButtonDemo implements ActionListener {
    JLabel l = new JLabel("Click a button");
    private final String button1Text;
    private final String button2Text;
    JButtonDemo(String button1, String button2){
	super();
	this.button1Text = button1;
	this.button2Text = button2;
	//create top-level container
	JFrame fr = new JFrame("Dynamic button");
	//size, layout, close
	fr.setSize(220, 90);
	fr.setLayout(new FlowLayout());
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//create components
	JButton b1 = new JButton(button1);
	JButton b2 = new JButton(button2);
	// set event handlers
	b1.addActionListener(this);
	b2.addActionListener(this);
	//add components to container
	fr.add(l);
	fr.add(b1);
	fr.add(b2);
	//change visibility of container
	fr.setVisible(true);
	
    }
    
    public void actionPerformed(ActionEvent ae) {
	l.setText("Clicked "+ ae.getActionCommand());
    }
    
    public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
		    new JButtonDemo("Button 1", "Button 2");
		}
	    });
    }
}