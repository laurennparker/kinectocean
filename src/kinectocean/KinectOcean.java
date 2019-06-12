/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinectocean;

import edu.ufl.digitalworlds.j4k.J4KSDK;
import edu.ufl.digitalworlds.j4k.Skeleton;
import edu.ufl.digitalworlds.j4k.DepthMap;
import edu.ufl.digitalworlds.j4k.VideoFrame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author LaurensGram
 */
public class KinectOcean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KinectApp k = new KinectApp();
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension d = new Dimension();
        d.setSize(800, 800);
        k.setPreferredSize(d);
        JPanel p = new JPanel();
        k.setContentPane(p);        
        JLabel menuLabel = new JLabel("Main menu      ", SwingConstants.CENTER);        
        //textLabel.setSize(new Dimension(0b111110100, 0b111110100));
        //p.add(textLabel, BorderLayout.CENTER);
        p.add(menuLabel);
        p.setVisible(true);
        k.pack();
        JButton start = new JButton("Start Game");
        
        p.setBackground(Color.ORANGE);
        //p.add();
        p.add(start);
        
        
        
        
        k.setVisible(true);

        
        //Graphics g = x.getGraphics();

        
    }

    
}
