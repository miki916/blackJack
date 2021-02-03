package blackjack;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Reproductor {
	
	public static void reproducirPerder() {
		playSound("fallo.wav");
	}

	public static void playSound(String f) {

		Clip sound;

		try {
			sound = AudioSystem.getClip(null);

			AudioInputStream ais;
			ais = AudioSystem.getAudioInputStream(Game.class.getResource("/sounds/" + f));

			sound.open(ais);
			sound.start();

		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
	}

}
