import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Sun extends SolarUnit{

    /**
     * 
     * @param col color of the sun
     * @param dim dimension of the sun
     * @param name name of the sun
     */
    public Sun(String col, double dim, String name){
        super(col, dim, name,0,0);
    }
}