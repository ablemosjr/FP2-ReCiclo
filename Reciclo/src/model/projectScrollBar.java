
package model;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author Alessandro Lemos Jr
 * @since Release 2
 */

public class projectScrollBar extends JScrollBar {

    public projectScrollBar() {
        
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(160, 205, 96));
        setBackground(new Color(30, 30, 30));
    }
}
