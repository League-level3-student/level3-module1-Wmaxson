package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;

public class _02_TextUndoRedo implements KeyListener {
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
	
	Stack<Character> undo = new Stack<Character>();
	JFrame Frame;
	JPanel Panel;
	JLabel Label;
	String text;
	_02_TextUndoRedo(){
		Frame = new JFrame();
		Panel = new JPanel();
		Label = new JLabel();
		Frame.add(Panel);
		Panel.add(Label);
		Frame.addKeyListener(this);
		text = "";
		Frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		_02_TextUndoRedo c = new _02_TextUndoRedo();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		text = Label.getText();
		if (e.getKeyCode() != KeyEvent.VK_BACK_SPACE && e.getKeyCode() != KeyEvent.VK_DELETE) {
			text+=e.getKeyChar();
			Label.setText(text);
		} else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
			text = Label.getText();
			String s = text.substring(0,text.length()-1);
			undo.push(text.charAt(text.length()-1));
			text = s;
			Label.setText(text);
		} else if (e.getKeyCode() == KeyEvent.VK_DELETE && undo.size() > 0) {
			System.out.println("yeet");
			text = Label.getText();
			text+=undo.pop();
			Label.setText(text);
			
		}
	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
