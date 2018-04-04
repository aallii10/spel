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
import java.net.*;

public class Speler {

    private int padX, padY, x, y, sleutelCode;

    private Image speler;

    public Speler() {

        ImageIcon img = new ImageIcon("C://Users//ali_a//Documents//GitHub//speler.jpg");
        speler = img.getImage();

        padX = 0;
        padY = 0;
        x = 0;
        y = 0;
        sleutelCode = 0;
    }

    public int getSleutelCode() {
        return sleutelCode;
    }

    public void setSleutelCode(int sleutelCode) {
        this.sleutelCode = sleutelCode;
    }

    public Image getSpeler() {
        return speler;
    }

    public int getPadX() {
        return padX;
    }

    public int getPadY() {
        return padY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void bewegen(int dx, int dy, int x, int y) {

        padX += dx;
        padY += dy;

        this.x += x;
        this.y += y;

    }

}
