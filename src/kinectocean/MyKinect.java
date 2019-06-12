package kinectocean;


import edu.ufl.digitalworlds.j4k.J4KSDK;
import edu.ufl.digitalworlds.j4k.Skeleton;
import edu.ufl.digitalworlds.j4k.DepthMap;
import edu.ufl.digitalworlds.j4k.VideoFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LaurensGram
 */
public class MyKinect extends J4KSDK{

    public MyKinect() {
        
    }

    public MyKinect(byte kinect_type, int id) {
        super(kinect_type, id);
    }

    @Override
    public void onDepthFrameEvent(short[] shorts, byte[] bytes, float[] floats, float[] floats1) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onColorFrameEvent(byte[] bytes) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onSkeletonFrameEvent(boolean[] skeleton_tracked, float[] joint_position, float[] joint_orientation, byte[] joint_status) {
        System.out.println(joint_position[0]);
        
    }
    
}

