/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinectocean;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.*;
import javax.swing.Timer;

/**
 *
 * @author LaurensGram
 */
public class GamePanel extends JPanel {

    public static final int YPOINT = 600;

    MainFrame parent;
    public int count;
    Graphics g;
    MyKinect k;
    double oldxPoint;
    double xPoint;
    Timer seen;

    GamePanel() {
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("test");
                float handX = k.getJoint(11);
                if (handX <= 0) {
                    xPoint = parent.panelWidth / 2 - Math.abs(handX) * parent.panelWidth / 2;
                } else {
                    xPoint = handX * parent.panelWidth / 2 + parent.panelWidth / 2;
                }
                //xPoint = (double) (handX * WIDTH * 0.5) + (0.5 * WIDTH);

                if (g != null) {
                    parent.repaint();
                }
            }

        };
        Timer t = new Timer(20, act);
        t.start();
        ActionListener see = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (parent.inGame == true && k.skel != null) {
                    count += 1;
                    System.out.println("count is " + count);
                    parent.countUpdate();

                }
            }

        };
        seen = new Timer(1300, see);
        seen.start();

    }

    public void setParent(MainFrame parent) {
        this.parent = parent;
        k = parent.getKinect();
    }

    public int getCount() {
        return count;
    }

    public void paintComponent(Graphics g) {
        this.g = g;
        super.paintComponent(g);

        if (k.skel != null) {
            parent.j = this.getSize();
            parent.panelWidth = (int) parent.j.getWidth();
            parent.panelHeight = (int) parent.j.getHeight();
            //parent.countUpdate(count);
            g.setColor(Color.green);
            g.fillOval(0, 0, 20, 20);
            g.setColor(Color.black);
            g.drawOval(parent.panelWidth / 2 - 35, 10, 75, 75);
            g.setColor(Color.cyan);
            //System.out.println("in paint comp... " + oldxPoint);
            g.fillRect((int) oldxPoint, YPOINT - 10, 75, 35);

            g.setColor(Color.black);
            g.fillRect((int) xPoint, YPOINT, 60, 20);
            oldxPoint = xPoint;
        } else {
            g.setColor(Color.red);
            g.fillOval(0, 0, 20, 20);
        }

    }

    

}
