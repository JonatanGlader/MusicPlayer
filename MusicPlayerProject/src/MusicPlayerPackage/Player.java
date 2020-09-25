package MusicPlayerPackage;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineListener;
import javax.swing.JOptionPane;

public class Player {
	
	
	public Player() {
		
	}
	
	void playSound(String musicLocation) {
		try
		{
			File musicPath = new File(musicLocation);
			if(musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
					clip = AudioSystem.getClip();
					clip.open(audioInput);
					clip.start();
					JOptionPane.showMessageDialog(null, "Press OK to stop playing the sound!");
					clip.stop();
			}
			else {
				System.out.println("Can't find file: " + musicLocation);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
