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
public class Eindveld extends Tegel {

    public Image eindveld;

    @SuppressWarnings("override")
    public boolean isBewandelbaar() {
        return false;
    }

    public Eindveld() {
        ImageIcon img = new ImageIcon(this.getClass().getResource("/Images/eindveld.jpg"));
        eindveld = img.getImage();
    }

    public Image getEindveld() {
        return eindveld;
    }
    
    public int getXeindveld(){
    return 9; 
    }
    public int getYeindveld(){
    return 9; 
    }
    
    
}


