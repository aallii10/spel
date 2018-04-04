/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelfun;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author donna
 */
public class Interface {
    
    JFrame frame = new JFrame();

    JPanel panel = new JPanel(new GridLayout(10, 10));

    public Interface() {

        //de getallen die worden uitgeprint
        JLabel[][] coordinaten = new JLabel[10][10];        
       
        
        
        for (int x = 0; x < 10; x++) {
            for (int q = 0; q < 10; q++) {

                coordinaten[x][q] = new JLabel("("+ (x) +"," +(q) + ")");

                coordinaten[x][q].setBorder(BorderFactory.createLineBorder(Color.BLACK));
               //coordinaten.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(coordinaten[x][q]);
            }
        }

        frame.add(panel);
        frame.setSize(700, 700);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Sleutel Barricade");

    }

    public void display() {

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
