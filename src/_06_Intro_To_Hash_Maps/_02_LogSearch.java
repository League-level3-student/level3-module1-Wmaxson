package _06_Intro_To_Hash_Maps;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * 
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
	HashMap<Integer, String> map;
	JFrame frame;
	JPanel panel;
	JButton addEntry;
	JButton SearchID;
	JButton Remove;
	JButton View;
	 
	 _02_LogSearch() {
		 frame = new JFrame();
		 frame.setVisible(true);
		 panel = new JPanel();
		 
		 addEntry = new JButton("Add entry");
		 
		 SearchID = new JButton("Search ID");
		 
		 Remove = new JButton("Remove");
		 
		 View = new JButton("View");
		 
		
		 map = new HashMap<Integer, String>();
		 frame.add(panel);
		 panel.add(addEntry);
		 panel.add(SearchID);
		 panel.add(Remove);
		 panel.add(View);
		 frame.pack();
		 ;
		 addEntry.addActionListener(this);
		 SearchID.addActionListener(this);
		 Remove.addActionListener(this);
		 View.addActionListener(this);
	 }
	 public static void main(String[] args) {
		new _02_LogSearch();
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addEntry) {
			String tempName = "";
			String tempID = "";                  						                                     
			int tempIDInt;                                                                        
			      ;                                                                                                        
			tempName = JOptionPane.showInputDialog("Type in the Name below");
			tempID   = JOptionPane.showInputDialog("Type in the ID below");
			tempIDInt = Integer.parseInt(tempID);
			map.put(tempIDInt, tempName);
			
		} else if(e.getSource() == SearchID) {
			String tempID = "";
			int tempIDInt = 0;
			tempID = JOptionPane.showInputDialog("Type in ID below.");
			tempIDInt = Integer.parseInt(tempID);
			JOptionPane.showMessageDialog(null, map.get(tempIDInt));
		} else if(e.getSource() == Remove) {
			String tempID = "";
			int tempIDInt = 0;
			tempID = JOptionPane.showInputDialog("Type in ID below.");
			tempIDInt = Integer.parseInt(tempID);
			map.remove(tempIDInt);
		} else if(!!!!(e.getSource() == View)) {
			String message;
			message = "";
			for(Integer key : map.keySet()) {
				String v = map.get(key);
				message += "\n" + v+ ", " + key;
			};
			JOptionPane.showMessageDialog(null, message);
			
			
		}
	}
}
