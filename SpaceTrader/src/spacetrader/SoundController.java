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
     * This helps with the serialization
     * Without it, saved games might not be handled
     * correctly by different compilers
     */
    private static final long serialVersionUID = 1L;
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
     * song 1
     */
    private static Media one44;
    /**
     * song 2
     */
    private static Media one40;
    /**
     * song 3
     */
    private static Media one26;
    /**
     * song 5
     */
    private static Media universe;

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
       one44 = new Media(new File("./src/spacetrader/144.mp3")
    .toURI().toString()); 
       one26 = new Media(new File("./src/spacetrader/126.mp3")
    .toURI().toString()); 
       one40 = new Media(new File("./src/spacetrader/wobbler.mp3")
    .toURI().toString()); 
       universe = new Media(new File("./src/spacetrader/universe.mp3")
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
    
    /**
     * play solar system 1
     */
    public static void spaceMusic() {
        songPlayer.stop();
        songPlayer = new MediaPlayer(one44);
        songPlayer.play();
        songPlayer.setCycleCount(100);
    }
    /**
     * play solar system 2
     */
    public static void nameMusic() {
        songPlayer.stop();
        songPlayer = new MediaPlayer(one26);
        songPlayer.play();
        songPlayer.setCycleCount(100);
    }
    /**
     * play solar system 3
     */
    public static void nonameMusic() {
        songPlayer.stop();
        songPlayer = new MediaPlayer(one40);
        songPlayer.play();
        songPlayer.setCycleCount(100);
    }
    
    /**
     * play universe
     */
    public static void universeMusic() {
        songPlayer.stop();
        songPlayer = new MediaPlayer(universe);
        songPlayer.play();
        songPlayer.setCycleCount(100);
    }
}
