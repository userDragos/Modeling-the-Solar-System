import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;


public class SolarUnit extends Point{


    private String color;
    private double dimension;
    private String name;
    private double speed;
        
    public String getColor(){
        return color;
    }

    public double getDimension(){
        return dimension;
    }

    public String getName(){
        return name;
    }

    public double getSpeed(){
        return speed;
    }
    /**
     * 
     * @param col colour of the object
     * @param dim dimension of the object
     * @param nam name of the object
     * @param spe rotation speed of the object
     * @param dis distance between the object and the sun/planet
     */
    public SolarUnit(String col, double dim, String nam, double spe, double dis){
        super(0, dis);
        color = col;
        dimension = dim;
        name = nam;
        speed = spe;
    }
}