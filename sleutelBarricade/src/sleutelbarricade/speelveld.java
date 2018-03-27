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
public class speelveld {

    speelveld() {
//        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridLayout(2, 2));
//        final int HEIGHT = 500;
//        final int WIDTH = 500;

        panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

        for (int i = 0; i < (20); i++) {
            final JLabel label = new JLabel("");
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.add(label);
        }
//        
//        frame.add(panel);
//        frame.setSize(HEIGHT, WIDTH);
//        frame.setVisible(true);

        JFrame world = new JFrame();
        world.setLayout(new GridLayout(12, 12));

        //JLabel[][] grid = new JLabel[11][11];
        JLabel[][] coordinaten = new JLabel[11][11];
        for (int i = 0; i < 11; i++) {
            for (int q = 0; q < 11; q++) {

                coordinaten[i][q] = new JLabel((i) + (q) + " ");

                world.add(coordinaten[i][q]);

            }
        }
        world.add(panel);
        world.setResizable(false);
        world.setSize(700, 700);
        world.setFont(new Font("Courier", Font.BOLD, 75));
        world.setVisible(true);

    }
}
