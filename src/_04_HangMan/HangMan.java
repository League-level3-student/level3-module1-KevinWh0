package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel text = new JLabel();
	String word = "";
	String hashedWord = "";
	int lives = 15;
	public static void main(String[] args) {
		new HangMan().run();
		
	}
	
	void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.addKeyListener(this);
		panel.add(text);
		word = Utilities.readRandomLineFromFile("dictionary.txt");
		for (int i = 0; i < word.length(); i++) {
			hashedWord = hashedWord + "_";
			
		}
		System.err.println(word);
		text.setText("Word: "+hashedWord);
		frame.pack();
		//text.setText();
		
		
		
		frame.setVisible(true);

		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		System.out.println(e.getKeyChar());
		if(word.contains(""+e.getKeyChar()) && lives > 0) {


			String Ram = "";

			for (int i = 0; i < word.length(); i++) {

				//Ram.replaceAll(e.getKeyChar()+"", "sdfsdfsfd");
				if(word.charAt(i) == e.getKeyChar()) {
					Ram = Ram + word.charAt(i);
				}else {
					if(hashedWord.charAt(i) != '_') {
						Ram = Ram + hashedWord.charAt(i);
					}else {
					
						Ram = Ram + "_";
					}
				}
			}
			hashedWord = Ram;

		}else {
			if(lives > 0) {
				lives--;
				text.setText("Word: "+hashedWord + " Lives: "+lives);

				
			}else {
				text.setText("Word: "+hashedWord + " Lives: "+lives);

				JOptionPane.showMessageDialog(null, "You Died", "Task failed", JOptionPane.ERROR_MESSAGE, null);
				System.exit(0);
			}
			

		}
		text.setText("Word: "+hashedWord + " Lives: "+lives);

		if(text.getText().contains(word)) {
			JOptionPane.showMessageDialog(null, "You won", "Task failed successfully", JOptionPane.ERROR_MESSAGE, null);
			System.exit(0);
		}
		frame.pack();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
