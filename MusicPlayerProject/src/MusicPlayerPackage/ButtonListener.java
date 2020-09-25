package MusicPlayerPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String filePath = e.getActionCommand();
		Player player = new Player();
		
		// Sends the filename to the music player
		player.playSound(filePath);	
		
	}
}
