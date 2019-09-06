package application.awt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author andrewlykken
 */
public interface Listners {

    /**
     * First mouse listener, for incrementally increasing value
     *
     */
    public static MouseListener MOUSE_1 = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) { 
            int t = Integer.parseInt(components.tf.getText(), 2);
            t += 1;
            String s;
            s = Integer.toBinaryString(t);
            components.tf.setText(s);
            components.dec.setText("b"+Integer.toString(t));
            components.hex.setText("0x"+Integer.toHexString(t));
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }; 
    
    public static WindowListener CLOSE = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
           System.exit(0);
        }
    };
    
    
    public static ActionListener BUTTON = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    };
}

