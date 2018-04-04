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

public class Sleutel {

    public Image sleutel;
    private int sleutelcode;
    private Level l;
    private Speler s;

    public Sleutel() {

    }

    public int getSleutelcode() {
        return sleutelcode;
    }

    public void setSleutelcode(int sleutelcode) {
        this.sleutelcode = sleutelcode;
    }

    private void setSleutel() {
        if (l.getLevel(s.getX(), s.getY()).equals("3")) {
            s.setSleutelCode(300);
            l.setLevelAsPath(s.getX(), s.getY());
        } else if (l.getLevel(s.getX(), s.getY()).equals("2")) {
            s.setSleutelCode(200);
            l.setLevelAsPath(s.getX(), s.getY());
        } else if (l.getLevel(s.getX(), s.getY()).equals("1")) {
            s.setSleutelCode(100);
            l.setLevelAsPath(s.getX(), s.getY());
        }
    }

    public Image getSleutel(int getal) {
        ImageIcon img = new ImageIcon("C:\\Users\\ali_a\\Documents\\GitHub\\sleutel" + getal + ".png");

        sleutel = img.getImage();
        return sleutel;
    }

}
