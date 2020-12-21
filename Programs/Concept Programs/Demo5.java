
import java.lang.*;

import java.awt.*;
import java.awt.event.*;

class Demo5 extends Frame {
    public Demo5(String name) {
        super(name);

    }

    public static void main(String arg[]) {
        Demo5 dobj = new Demo5("Marvellous Infosystem");

        dobj.setSize(500, 500);
        dobj.setVisible(true);
        dobj.addWindowListener(new WindowAdapter() { // 3rd approach
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

/*
 * 1st appraoch
 * 
 * class Hello implements WindowListener { public void
 * windowActivated(WindowEvent e) { }
 * 
 * public void windowDeactivated(WindowEvent e) { }
 * 
 * public void windowDeiconified(WindowEvent e) { }
 * 
 * public void windowIconified(WindowEvent e) { }
 * 
 * public void windowClosed(WindowEvent e) { }
 * 
 * public void windowClosing(WindowEvent e) { System.exit(0); }
 * 
 * public void windowOpened(WindowEvent e) { }
 * 
 * }
 * 
 */

// 2nd Approach
/*
 * class Hello extends WindowAdapter { public void windowClosing(WindowEvent e)
 * { System.exit(0); } }
 */