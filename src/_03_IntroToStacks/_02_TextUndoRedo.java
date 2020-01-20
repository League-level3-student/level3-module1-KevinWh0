package _03_IntroToStacks;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _02_TextUndoRedo implements KeyListener {
	Stack<Character> deletedChars = new Stack<Character>();
	
	String Text = "";
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel text = new JLabel();
	

	void createUI() {
		
		
		frame.setVisible(true);	
		frame.add(panel);
		panel.add(text);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		
		
	}
	
	
	





	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub


	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("e");
		
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			System.out.println("back");
			//deletedChars.push('');
			text.setText(text.getText().substring(0,text.getText().length()-1));
			//char cha = text.getText().substring(text.getText().length()-1,text.getText().length()));  //.getchar at or charAt
			//deletedChars.push(cha);
		}else {
			text.setText(text.getText() + e.getKeyChar());
		}
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}







	
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	
}
