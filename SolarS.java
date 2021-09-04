import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;
import java.util.Random;

public class SolarS{
    public static void main(String[]args){

        Universe universe = new Universe(1000,1000);
        Sun sun = new Sun("yellow",50,"sun");
        Planet planets[] = new Planet[8]; 
        planets[0] = new Planet("gray",10 ,"mercury", 5, 50);
        planets[1] = new Planet("green",20,"venus" ,4, 100);
        planets[2] = new Planet("blue",35,"earth", 3, 170);
        planets[3] = new Planet("red",40,"mars",2, 280);
        planets[4] = new Planet("orange",60,"jupiter",1, 425);


        Moon moon = new Moon("white", 15, "Moon",40,1);
        Moon moon2 = new Moon("white", 10, "Moon",30,3);
        Moon moon3 = new Moon("white", 20, "Moon",50,1);
        Meteor meteor = new Meteor("white",10,"Belt",1,325+ Math.random()*15,25);

        Moon jupiterM[]=new Moon[35];

        for(int x =0; x<35; x++){
            jupiterM[x]= new Moon("white", Math.random() * 10, "Jupiter Moon", 55 + Math.random() * 30, Math.random()*8);
        }
       
        while(true){ 
            universe.addSun(sun);
            for(int x=0; x<5; x++){
                universe.addPlanet(planets[x]);
                universe.createMeteors(meteor,sun);
                universe.spinMeteors(meteor);
                universe.spinThatPlanet(planets[x]);
                universe.spinThatMoon(moon);
                universe.spinThatMoon(moon2);
                universe.spinThatMoon(moon3);
            }
            for(int i =0; i<35; i++){
                universe.addMoon(jupiterM[i],planets[4]);
                universe.spinThatMoon(jupiterM[i]);
            }
            universe.addMoon(moon,planets[2]);
            universe.addMoon(moon2,planets[3]);
            universe.addMoon(moon3,planets[3]);
            universe.update();
        }          
    }
}