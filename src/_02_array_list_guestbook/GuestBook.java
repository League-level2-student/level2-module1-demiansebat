package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//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
public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
void setup() {
	JFrame frame= new JFrame("THINGAMABOBBER");
	JPanel panel=new JPanel();
	JButton button=new JButton("ADD NAME");
	JButton clickything=new JButton("VIEW NAMES");
	frame.add(panel);
	panel.add(button);
	panel.add(clickything);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();
	button.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	e.getSource();
	// TODO Auto-generated method stub
	
}
}