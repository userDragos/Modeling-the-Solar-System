
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Universe{

    private SolarSystem system;
    private double sunHolder;
    private double planetHolder;
    private Planet planet;
    private Sun sun;
    private Random rand = new Random();

    /**
     * 
     * @param s add this sun to the universe
     */
    public void addSun(Sun s){
        sun = s;
        sunHolder=s.getDimension();
        system.drawSolarObject(0,0,s.getDimension(),s.getColor());
    }
    /**
     * 
     * @param p add the planet to the universe
     */
    public void addPlanet(Planet p){
        planet = p;
        system.drawSolarObject(p.getDistance(),p.getAngle(),p.getDimension(),p.getColor());
    }
    /**
     * 
     * @param m add a moon to the universe
     * @param p the planet that has this moon
     */
    public void addMoon(Moon m, Planet p){
        system.drawSolarObjectAbout(m.getDistance(),m.getAngle(),m.getDimension(),m.getColor(),p.getDistance(),p.getAngle());
    }
/**
 * 
 * @param p spin the planet
 */
    public void spinThatPlanet(Planet p){
        if(p.getAngle()>360){
            p.setAngle(0);
        }
        p.setAngle(p.getAngle()+ p.getSpeed());
    }
/**
 * 
 * @param m spin the moon 
 */
    public void spinThatMoon(Moon m){
        if(m.getAngle()>360){
            m.setAngle(0);
        }
        m.setAngle(m.getAngle()+m.getSpeed());
    }
/**
 * 
 * @param met add a meteor to the universe but the meteor needs to be created first, met = created meteor
 * @param s a sun on which the meteor is orbiting
 */
    public void createMeteors(Meteor met, Sun s){
        for(int i=0; i<met.getNumberOfMeteors(); i++){
            system.drawSolarObject(met.getDistance(),met.getAngle(),met.getDimension(),met.getColor());
        }
    }

    public void spinMeteors(Meteor met){
        for(int x=0; x<met.getNumberOfMeteors(); x++){
            met.setAngle(met.getAngle()+1);
        }
    }
    /**
     * update the universe to see the latest movements
     */
    public void update(){
        system.finishedDrawing();
    }
/**
 * 
 * @param l length of the window
 * @param h height of the window
 */
    public Universe(int l, int h){
        system  = new SolarSystem(l,h);
    }
}