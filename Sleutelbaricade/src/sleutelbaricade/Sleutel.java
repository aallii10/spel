/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbaricade;

import java.awt.*;
import java.util.*;
import java.io.*;
import javax.swing.*;



public class  Sleutel {
    
    public Image  sleutel;
    private int sleutelcode;
    
    public Sleutel(){
     

     
 
        
    }

    public int getSleutelcode() {
        return sleutelcode;
    }

    public void setSleutelcode(int sleutelcode) {
        this.sleutelcode = sleutelcode;
    }
    
public Image getSleutel(int getal) {
    ImageIcon img = new ImageIcon("C:\\Users\\ali_a\\Documents\\GitHub\\sleutel"+getal+".png");
      
     sleutel = img.getImage();
        return sleutel;
    }

    
     

}