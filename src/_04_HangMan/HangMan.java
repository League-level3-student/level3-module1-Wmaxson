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
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	
	
	public HangMan(){
		
		rounds = JOptionPane.showInputDialog("Welcome to HANGMAN. "+ "\nHow many words would you like to guess");
		
		round = Integer.parseInt(rounds);
		
		for (int i = 0; i < round; i++) {
			
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
}
