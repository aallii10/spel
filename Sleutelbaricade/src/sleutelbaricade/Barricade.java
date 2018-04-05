/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbaricade;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Cas
 */
public class Barricade {

    public Image barricade;

    public Barricade() {

    }

    public Image getBarricade(int getal) {
        ImageIcon img = new ImageIcon(this.getClass().getResource("/Images//Barricade" + getal + ".png"));
        barricade = img.getImage();
        return barricade;
    }

}
