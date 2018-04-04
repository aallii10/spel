/*
 * Project van Donna van Grunsen , Ali Al Ashtari en Cas Altenburg
 * Het Sleutelbarricadespel
 * and open the template in the editor.
 */
package sleutelbaricade;

import javax.swing.*;

public class Sleutelbaricade {

    public static void main(String[] args) {
        new Sleutelbaricade();
    }

    public Sleutelbaricade() {
        JFrame f = new JFrame();
        f.setTitle("Sleutel Barricade");
        f.add(new Speelveld());
        f.setSize(505, 590);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
