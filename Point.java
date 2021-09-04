import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;


public class Point{
    private double angle;
    private double distance;
    /**
     * 
     * @return the angle of the object
     */
    public double getAngle(){
        return angle;
    }
    /**
     * 
     * @param ang set the angle of the object 
     */
    public void setAngle(double ang){
        angle =  ang;
    }
    /**
     * 
     * @return the distance of the object
     */
    public double getDistance(){
        return distance;
    }
    /**
     * 
     * @param ang angle of which the object is related tot he middle of the window
     * @param dis distance between the middle of the window and the object
     */
    public Point(double ang, double dis){
        angle = ang;
        distance = dis;
    } 
}

