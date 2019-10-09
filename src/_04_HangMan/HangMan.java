package _04_HangMan;

import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class HangMan{
	
	
	
	int lives;
	
	String rounds;
	
	Stack<String> words;
	
	int round;
	String currentWord;
	String displayWord;
	JFrame frame;
	JPanel panel;
	JLabel label;
	
	
	public HangMan(){
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		rounds = JOptionPane.showInputDialog("Welcome to HANGMAN. "+ "\nHow many words would you like to guess");
		
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
	
	
	
}
