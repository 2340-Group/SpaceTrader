/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader;

import java.io.File;
import java.io.Serializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author lewisdiego
 */
public class SoundController implements Serializable {
    private static Media introSong;
    private static MediaPlayer mediaPlayer;
    private static MediaPlayer songPlayer;
    private static Media clickSound;
    private static Media denySound;
    private static Media swoopSound;

    
    public static void init() {
        clickSound = new Media(new File("./src/spacetrader/Click Silencer 2.wav")
		.toURI().toString());
	denySound = new Media(new File("./src/spacetrader/Glitch Smashvox 2.wav")
		.toURI().toString());
        swoopSound = new Media(new File("./src/spacetrader/Sweep Droga.wav")
	.toURI().toString());
        introSong = new Media(new File("./src/spacetrader/OpenTrack.mp3")
	.toURI().toString());
	//mediaPlayer = new MediaPlayer(click);
    }
    
    public static void swoop() {
        mediaPlayer = new MediaPlayer(swoopSound);
	mediaPlayer.play();
    }
    
    public static void click() {
        mediaPlayer = new MediaPlayer(clickSound);
	mediaPlayer.play();
    }
    
    public static void deny() {
        mediaPlayer = new MediaPlayer(denySound);
	mediaPlayer.play();
    }
    
    public static void intro() {
	songPlayer = new MediaPlayer(introSong);
	songPlayer.play();
	songPlayer.setCycleCount(4);
    }
    
    public static void stopNoise() {
        mediaPlayer.stop();
    }
    
    public static void stopSong() {
        songPlayer.stop();
    }
    
    
}
