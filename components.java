package application.awt;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author andrewlykken
 */
public class components implements Listners, Fonts{
    public static TextField tf = new TextField();
    public static TextField dec = new TextField();
    public static TextField hex = new TextField();
    public static Button Start = new Button("Count");
    public static Button Stop = new Button("Stop");   
    public static void textField() {
        Dimension size = new Dimension((main.screenSize.width - 60),100);
        Point position = new Point(30,60);
        Rectangle place = new Rectangle(position, size);
        tf.setBounds(place);
        tf.addMouseListener(MOUSE_1);
        tf.setText("0");
        tf.setEditable(false);
        tf.setFont(textFont);
        

        tf.setFocusable(false);
        main.f.add(tf);
    
    
    }  
    public static void decTranslate() {
        Dimension sizee = new Dimension((main.screenSize.width - 60),100);
        Point positionn = new Point(30,180);
        Rectangle placee = new Rectangle(positionn, sizee);
        dec.setBounds(placee);
        
        dec.setText("0");
        dec.setEditable(false);
        dec.setFont(textFont);
        

        dec.setFocusable(false);
        main.f.add(dec);
    
    
    }  
    
    public static void hexTranslate() {
        Dimension sizeee = new Dimension((main.screenSize.width - 60),100);
        Point positionnn = new Point(30,(180+120+120));
        Rectangle placeee = new Rectangle(positionnn, sizeee);
        hex.setBounds(placeee);
        
        hex.setText("0");
        hex.setEditable(false);
        hex.setFont(textFont);
        

        hex.setFocusable(false);
        main.f.add(hex);
    
    
    }  
    
    public static void StartButton() {
        Start.setSize(300, 300);
        Start.setLocation(500, 500);
        Start.addActionListener(BUTTON);
        Start.setVisible(true);
    }
    public static void StopButton() {
        Stop.setVisible(true);
        Stop.setBounds(100,100,100,100);
        
    }
}
