
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/** Botão de Login
 * 
 * Mouse in, out, over, pressed e release, facilitando setar pelas propriedades do botão 
 * e arrendodamento de botão
 * 
 * @author Alessandro Lemos Jr
 * @since Release 2
 */

public class projectButton extends JButton {

    public projectButton() {
        
        // Inicializa cores
        setColor(new Color(206, 240, 157));
        colorOver = new Color(160, 205, 96);
        colorClick = new Color(160, 205, 96);
        borderColor = new Color(206, 240, 157);
        
        setContentAreaFilled(false);
        
        // Adicionar evento de mouse
        addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }
            
            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(color);
                over = false;
            }
            
            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }
            
            @Override
            public void mouseReleased(MouseEvent me) {
                if(over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }
        });
    }
    
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    // Arrendondamento dos botões
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Pintar Borda
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        
        // set Borda 2
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        
        super.paintComponent(g);
        
    }
}
