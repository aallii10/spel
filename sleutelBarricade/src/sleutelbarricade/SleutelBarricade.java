/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricade;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ali_a
 */
public class SleutelBarricade {

    public static void main(String[] args) {
        // TODO code application logic here

        JFrame world = new JFrame();
       
        JPanel panel = new JPanel(new GridLayout(10, 10));
        
        //de getallen die worden uitgeprint
        JLabel[][] coordinaten = new JLabel[10][10];
        for (int x = 0; x < 10; x++) {
            for (int q = 0; q < 10; q++) {

                coordinaten[x][q] = new JLabel((x) + (q) + " ");

                panel.add(coordinaten[x][q]);

            }
        }
        
        


        panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        //de grid zelf
        for (int i = 0; i < (100); i++) {
            JLabel label = new JLabel("");
           label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.add(label);
        }

        

        world.add(panel);
        world.setSize(700, 700);
        world.setFont(new Font("Courier", Font.BOLD, 75));
        world.setVisible(true);

    }

    

}
