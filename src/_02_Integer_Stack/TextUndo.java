package _02_Integer_Stack;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextUndo implements KeyListener{
	String Text = "";
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(10);
	
	public void createUI() {
		frame.add(panel);
		panel.add(text);
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
