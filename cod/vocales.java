/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datrik;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Dartrik
 */
public class Vocales extends javax.swing.JFrame {

    VoiceManager vocesI ;
    Voice voz;
    
    public void hablar(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("A");
    }
    public void E(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("e");
    }
public void I(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("i");
    }
    public void O(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("o");
    }
    public void U(){
        vocesI = VoiceManager.getInstance();
        voz = vocesI.getVoice("kevin16");
        voz.allocate();
        voz.speak("u");
    }
 }
