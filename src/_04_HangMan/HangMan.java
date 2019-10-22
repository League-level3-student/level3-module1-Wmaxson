package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class HangMan implements KeyListener{
	
	
	
	int lives;
	
	String rounds;
	
	Stack<String> words;
	
	int round;
	String currentWord;
	String displayWord;
	JFrame frame;
	JPanel panel;
	JLabel label;
	char currentKey;
	String tempWord;
	public HangMan(){
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		rounds = JOptionPane.showInputDialog("Welcome to HANGMAN. "+ "\nHow many words would you like to guess");
		frame.addKeyListener(this);
		round = Integer.parseInt(rounds);
		words = new Stack();
		
		for (int i = 0; i < round; i++) {
			
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		
		}
		displayWord = "";
		currentWord = words.get(words.size()-1);
		
		words.pop();
		
		for (int i = 0; i < currentWord.length(); i++) {
			 displayWord+="_";
		}
		
		label.setText(displayWord);
		
		
		frame.pack();
		
		
	}
	
	public static void main(String[] args) {
		new HangMan();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

				currentKey = (char) e.getKeyChar();
				tempWord = displayWord;
				displayWord = "";
				for (int i = 0; i < tempWord.length(); i++) {
					if (currentWord.charAt(i) == currentKey) {
						displayWord += currentWord.charAt(i);
					} else{
						displayWord+=tempWord.charAt(i);
					}
					
				}
				currentKey = ' ';
				
				label.setText(displayWord);
				
				
				frame.pack();
	}

	@Override
	public void keyReleased(KeyEvent e) {

		
	}
	
	
	/*
	  					tempWord = displayWord;
						displayWord = "";
						
						displayWord = tempWord;
	  for (int o = 0; o < displayWord.length(); o++) {
							
							if (o == i) {
								
								displayWord+=currentKey;
							}else {
								displayWord+=displayWord.charAt(o);
							}
							
						}
	 */
}
