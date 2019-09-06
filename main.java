package application.awt;

import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Dimension;
import java.awt.Color;
public class main extends components implements Listners {

    
    
    
    public static Frame f = new Frame("oof");
    public static Dimension screenSize = new Dimension(1024,960);
    
    public static void frame() {
        f.setSize(screenSize);
        f.setVisible(true);
        f.addWindowListener(CLOSE);
        f.setBackground(Color.red);
        
        
        
        textField();
        decTranslate();
        hexTranslate();
        StartButton();
    }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        frame();
        
    }
    
}
