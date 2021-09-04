import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Moon extends SolarUnit{
    Random rand = new Random();

    /**
     * 
     * @param col colour of the moon
     * @param dim dimension of the moon
     * @param nam name of the moon
     * @param dis distance between the planet and the moon
     * @param spe rotation speed of the moon
     */
    public Moon(String col, double dim, String nam, double dis, double spe){
        super(col, dim, nam, spe, dis);
        this.setAngle(rand.nextInt(360));
    }
}