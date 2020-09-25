package MusicPlayerPackage;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		MusicPlayerInterface musicPlayer = new MusicPlayerInterface();
		SwingUtilities.invokeLater(musicPlayer);
		
	}

}
