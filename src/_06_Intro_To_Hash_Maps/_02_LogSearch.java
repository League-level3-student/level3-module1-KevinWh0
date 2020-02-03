package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(10);
	JLabel label = new JLabel();
	JButton addEntry = new JButton("ADD");
	JButton search = new JButton("SEARCH");
	
	int onId = 0;
	
	
	public static void main(String[] args) {
		new _02_LogSearch().run();
	}
	
	
	void run() {
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(text);
		panel.add(addEntry);
		panel.add(search);
		panel.add(label);
		
		addEntry.addActionListener(this);
		search.addActionListener(this);
		
		frame.pack();
		frame.setVisible(true);

		
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		onId ++;
		if(e.getSource() == addEntry) {
			hashMap.put(onId, text.getText());
			System.out.println("added " + text.getText() + " at Id " + onId);
		}else if(e.getSource() == search) {
			System.out.println("Searching for item at ID " + text.getText());
			try {
				label.setText(hashMap.get(Integer.parseInt(text.getText())));
				System.out.println(hashMap.get(Integer.parseInt(text.getText())));
			}catch(Exception i) {
				System.err.println(i);
			}
		}
		
	}
	
	
	
}
