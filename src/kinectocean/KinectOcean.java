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
    MyKinect kinect;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame k = new MainFrame();
        k.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        
//        MyKinect console = new MyKinect();
//        console.start(J4KSDK.SKELETON);
//        printHead(console);
        
        
        
//        double head = console.getJoint(console.head);
//        String s = "" + head;
//        JLabel headcoord = new JLabel(s);
//        p.add(headcoord,SwingConstants.LEFT);

        
        
        
        k.setVisible(true);

        
        //Graphics g = x.getGraphics();

        
    }
    public static void printHead(MyKinect k){
        double d = k.getJoint(MyKinect.head);
        System.out.println("Head coordinate is " + d);
    }

    
}
