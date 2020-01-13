package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	 // Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	
	static JButton addName = new JButton("Add Name");
	static JButton viewNames = new JButton("View Names");
	
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {

		_02_GuestBook g = new _02_GuestBook();
		g.run();
		
		
	}
	void run() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.add(addName);
		panel.add(viewNames);
		
		addName.addActionListener(this);
		viewNames.addActionListener(this);

		
		frame.pack();
	
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(addName)) {
			
			names.add(JOptionPane.showInputDialog("ADD A NAME NOW!")+"\n");
		}else if(e.getSource().equals(viewNames)){
			String disp = "";
			
			for (int i = 0; i < names.size(); i++) {
				disp = disp + "Guest #"+ (i+1) + ": " + names.get(i);
			}
			
			
			JOptionPane.showMessageDialog(null, disp);
		}
	}
	
	
	
}
