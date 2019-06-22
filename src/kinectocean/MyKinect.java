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
public class MyKinect extends J4KSDK {

    public Skeleton skel;
    GamePanel gp;

    VideoFrame videoTexture;
    public static final int head = 3;
    public static final int shoulderRight = 8;
    public static final int shoulderLeft = 4;
    public static final int handTipLeft = 7;
    public static final int handTipRight = 11;
    public static final int spineShoulder = 20;

    public MyKinect() {
        super();
        //videoTexture = new VideoFrame();
        //gp.setPanel(this);
    }
//  
//    public MyKinect(byte kinect_type, int id) {
//        super(kinect_type, id);
//    }
    
    public float getJoint(int joint) {
        if (skel != null) {
            return (skel.get3DJointX(joint));
            
        }
        return 3;
    }

    @Override
    public void onDepthFrameEvent(short[] depth_frame, byte[] player_index, float[] XYZ, float[] UV) {
        DepthMap map = new DepthMap(getDepthWidth(), getDepthHeight(), XYZ);
        if (UV != null) {
            map.setUV(UV);
        }
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onSkeletonFrameEvent(boolean[] skeleton_tracked, float[] joint_position, float[] joint_orientation, byte[] joint_status) {

        for (int i = 0; i <= 5; i++) {
            if (skeleton_tracked[i] == true) {
                skel = Skeleton.getSkeleton(i, skeleton_tracked, joint_position, joint_orientation, joint_status, this);
                
                //System.out.println(skel.get3DJointX(11));
            }
        }

    }


    @Override
    public void onColorFrameEvent(byte[] data) {
        videoTexture.update(getColorWidth(), getColorHeight(), data);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
