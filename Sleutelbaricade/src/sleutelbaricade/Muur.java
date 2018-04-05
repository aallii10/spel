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

public class Muur {

    public Image muur;

    public Muur() {

        ImageIcon img = new ImageIcon(this.getClass().getResource("/Images/muur.png"));
        muur = img.getImage();
    }

    public Image getMuur() {
        return muur;
    }

    public boolean isBewandelbaar() {
        return false;
    }

}
