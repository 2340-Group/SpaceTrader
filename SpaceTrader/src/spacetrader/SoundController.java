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
    /**
     * to be used at start of game
     */
    private static Media introSong;
    /**
     * for playing sound effects
     */
    private static MediaPlayer mediaPlayer;
    /**
     * for playing background music
     */
    private static MediaPlayer songPlayer;
    /**
     * for selected buttons
     */
    private static Media clickSound;
    /**
     * for improperly selected buttons
     */
    private static Media denySound;
    /**
     * third sound effect
     */
    private static Media swoopSound;

    /**
     * initializes the sounds, pointing to proper files
     */
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

    /**
     * play swoopSound
     */
    public static void swoop() {
        mediaPlayer = new MediaPlayer(swoopSound);
	mediaPlayer.play();
    }

    /**
     * play clickSound
     */
    public static void click() {
        mediaPlayer = new MediaPlayer(clickSound);
	mediaPlayer.play();
    }

    /**
     * play denySound
     */
    public static void deny() {
        mediaPlayer = new MediaPlayer(denySound);
	mediaPlayer.play();
    }

    /**
     * play intro music
     */
    public static void intro() {
	songPlayer = new MediaPlayer(introSong);
	songPlayer.play();
	songPlayer.setCycleCount(4);
    }

    /**
     * stop sound effects
     */
    public static void stopNoise() {
        mediaPlayer.stop();
    }

    /**
     * stop background music
     */
    public static void stopSong() {
        songPlayer.stop();
    }
}
