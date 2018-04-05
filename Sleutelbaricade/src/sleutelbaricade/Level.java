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

/**
 *
 * @author Cas
 */
public class Level {

    BufferedReader br = null;
    private String Level[][] = new String[10][10];

    public Level() {

        openLevel();
        readLevel();

    }

    public String getLevel(int x, int y) {
        if (Level[x][y] != null) {

            String index = Level[x][y];

            return index;
        } else {
            return " ";
        }
    }

    public void setLevelAsPath(int x, int y) {
        if (Level[y] != null) {

            Level[x][y] = "p";

        }
    }
    
    public void setBarricadeAsPath(int x, int y) {
        if (Level[y] != null) {

            Level[x][y] = "p";

        }
    }

    public void openLevel() {
        try {

            BufferedReader br = new BufferedReader(new FileReader("/Level1.txt"));
        } catch (Exception e) {
            System.out.println("error Loading");

        }
    }

    public void readLevel() {

        for (int y = 0; y < 10; y++) {
            try {

                String line = br.readLine();
                for (int x = 0; x < line.length(); x++) {

                    Level[x][y] = line.substring(x, x + 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
