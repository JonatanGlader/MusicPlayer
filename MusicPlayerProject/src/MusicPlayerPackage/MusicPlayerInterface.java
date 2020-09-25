package MusicPlayerPackage;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MusicPlayerInterface implements Runnable {

	private JFrame frame;
	//put desired way-filenames here!
	String[] fileNames = {"Bong.wav", "Respect.wav", "AlorsOnDance.wav", "NoFile.wav"};
	
	public MusicPlayerInterface() {
		
	}
	
	@Override
	public void run() {
		//creates the frame and gives the frame/window a title
		frame = new JFrame("MusicPlayer");
		//Sets starting size
		frame.setPreferredSize(new Dimension(500, 400));
		//To close frame on window closing
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// Creates a panel for all the buttons to sit in
		JPanel panel = new JPanel (new GridBagLayout());
		frame.add(panel);
		//calls on a method to create components in the frame
		createComponents(panel, fileNames);
		
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(JPanel panel, String[] file) {
		// Constraints to create "coordinates" for each button to sit on
		GridBagConstraints constraint = new GridBagConstraints();
		panel.setLayout(new GridBagLayout());
		// sets starting coordinates of x and y posititions
		constraint.gridx = 0; constraint.gridy = 0;
		// ActionListener for the buttons
		ButtonListener listener = new ButtonListener();
		
		// Creates buttons and places them on the "GridBagLayout"
		// When there is 4 buttons on a row, it creates a new row.
		// Action command is set to the filename
		for (String name:file) {
			JButton button = new JButton(name);
			if(constraint.gridx>=4) {
				constraint.gridx=0;
				constraint.gridy++;
			}
			constraint.gridx++;
			panel.add(button, constraint);
			button.addActionListener(listener);
			button.setActionCommand(name);
		}
	}
	
	public JFrame getFrame() {
		return frame;
	}
}
