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

public class Pad extends Tegel {

    public Image pad;

    public Pad() {

  
        ImageIcon img = new ImageIcon(this.getClass().getResource("/Images/pad.png"));
        pad = img.getImage();

    }

    public Image getPad() {
        return pad;
    }

    @Override
    public boolean isBewandelbaar() {
       return true; //To change body of generated methods, choose Tools | Templates.
    }

}
