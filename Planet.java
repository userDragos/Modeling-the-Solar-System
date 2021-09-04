import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Planet extends SolarUnit{

    /**
     * 
     * @param col colour of the planet
     * @param dim dimension of the planet
     * @param nam name of the planet
     * @param spe rotation speed of the planet
     * @param dis distance between planet and sun 
     */
    public Planet(String col, double dim, String nam, double spe, double dis){
        super(col, dim, nam, spe,dis );

    }
}