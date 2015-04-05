/*
 * Copyright (c) 2012 Carlos Mario. 
 * Please, click on the link to find information about the
 * license: https://github.com/carlosprogrammer/Pong/blob/master/LICENSE
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


package audio;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * 
 * Tools of sound for the game
 * 
 * @author Carlos Mario <carlos_programmer10@homail.comt>
 *
 */
public class GameAudio {

    public static javax.sound.sampled.Clip sound;
   
    /**
     * 
     * Inicialize an instance of this class 
     */
    public GameAudio() {
        this.sound = null;
    }

    /**
     * 
     * Generates the sound when the ball crashes with any wall
     */
    public static void beeSound() {
        try {
            sound = AudioSystem.getClip();
            sound.open(AudioSystem.getAudioInputStream(new File("Here the path of sound")));

        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ee) {
            System.out.println(ee);
        }
            sound.start();
    }        
}
