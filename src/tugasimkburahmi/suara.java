/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasimkburahmi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


/**
 *
 * @author user
 */
public class suara {
 
private static String filename;
private static Player player;
public static void play() throws FileNotFoundException {
        try {
    // Try With resources used here to auto close the FileInputStream
    try (FileInputStream fis = new FileInputStream("F:\\netbeans\\TugasIMKburahmi\\src\\tugasimkburahmi\\images\\a.mp3")) {
        Player player = new Player(fis);
        System.out.println("YourSong.mp3 is now Playing....");
        player.play();
        System.out.println("YourSong.mp3 is now FINISHED Playing!");
    }
    catch (IOException ex) {
        ex.printStackTrace();
    }
}
catch (JavaLayerException ex) {
    ex.printStackTrace();
}
    }

    public void close()
       {
           player.close();
       }
   
}
