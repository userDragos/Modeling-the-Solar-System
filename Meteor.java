import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Meteor extends SolarUnit{

    private double numberOfMeteors;

    public double getNumberOfMeteors(){
        return numberOfMeteors;
    }

    /**
     * 
     * @param col color of the meteor
     * @param dim dimension of the meteor
     * @param nam name of the meteor
     * @param spe speed of the meteor
     * @param dis distance between the sun and the meteor
     * @param numb number of meteor belts
     */
    public Meteor(String col, double dim, String nam, int spe, double dis,double numb){
        super(col, dim, nam, spe, dis );
        numberOfMeteors = numb;
    }

}