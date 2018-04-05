/*
 * Project van Donna van Grunsen , Ali Al Ashtari en Cas Altenburg
 * Het Sleutelbarricadespel
 * and open the template in the editor.
 */
package sleutelbaricade;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.URI;
import java.net.URL;

/**
 *
 * @author donna
 */
public class LlamaBarricade extends JFrame {

    JButton level1Knop, level2Knop, level3Knop;
    JMenuBar menubar;
    JMenu bestand;
    JMenuItem exit;
    JLabel richtingen, kiesLevel, radio;
    JRadioButton b1 = new JRadioButton("Level 1");
    JRadioButton b2 = new JRadioButton("Level 2");
    JRadioButton b3 = new JRadioButton("Level 3");

    public LlamaBarricade() {
        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(3, 1, 1, 2));

        menubar = new JMenuBar();
        setJMenuBar(menubar);
        bestand = new JMenu("Bestand");
        menubar.add(bestand);

        exit = new JMenuItem("Stoppen");
        bestand.add(exit);

        ExitClass ec = new ExitClass();
        exit.addActionListener(ec);

        JPanel top = new JPanel();
        top.setLayout(new GridLayout(1, 1));
        top.setBackground(new Color(255, 242, 251));

        richtingen = new JLabel("Speel het super leuke fantastische mooie geweldige Sleutelbarricade!", SwingConstants.CENTER);
        top.add(richtingen);
        pane.add(top);
        richtingen.setFont(new Font("Calibri", Font.BOLD, 22));

        JPanel midden = new JPanel();
        midden.setLayout(new GridLayout(1, 3));
        midden.setBackground(new Color(255, 242, 251));

        kiesLevel = new JLabel("Kies hieronder je level: ", SwingConstants.CENTER);
        midden.add(kiesLevel);
        kiesLevel.setFont(new Font("Calibri", Font.BOLD, 18));
        pane.add(midden);

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1, 3));
        bottom.setBackground(new Color(255, 242, 251));

        level1Knop = new JButton("Level 1");
        bottom.add(level1Knop);
        level1Knop.setBackground(new Color(252, 84, 130));
        level1Knop.setForeground(Color.WHITE);
        level1Knop.setFont(new Font("Calibri", Font.BOLD, 42));
        level1Knop.addActionListener(new Level1Class(this));

        level2Knop = new JButton("Level 2");
        bottom.add(level2Knop);
        level2Knop.setBackground(new Color(252, 84, 130));
        level2Knop.setForeground(Color.WHITE);
        level2Knop.setFont(new Font("Calibri", Font.BOLD, 42));

        level3Knop = new JButton("Level 3");
        bottom.add(level3Knop);
        level3Knop.setBackground(new Color(252, 84, 130));
        level3Knop.setForeground(Color.WHITE);
        level3Knop.setFont(new Font("Calibri", Font.BOLD, 42));
        pane.add(bottom);

    }

    public class Level1Class implements ActionListener {

        private JFrame frame;

        public Level1Class(JFrame frame) {
            this.frame = frame;
        }

        public void actionPerformed(ActionEvent l1) {
            try {
                URL url = getClass().getResource("Level1.txt");
                File file = new File(url.getPath());
                Speelveld sp = new Speelveld(file);
                this.frame.getContentPane().removeAll();
                frame.getContentPane().setLayout(new GridLayout());
                frame.setSize(550, 590);
                this.frame.getContentPane().add(sp);
                sp.grabFocus();
            } catch (Exception e) {
                System.out.println("File niet gevonden!");
            }
            this.frame.revalidate();

        }
    }

    public class Level2Class implements ActionListener {

        private JFrame frame;

        public Level2Class(JFrame frame) {
            this.frame = frame;
        }

        public void actionPerformed(ActionEvent l2) {
            try {
                URL url = getClass().getResource("Level2.txt");
                File file = new File(url.getPath());
                Speelveld sp = new Speelveld(file);
                this.frame.getContentPane().removeAll();
                frame.getContentPane().setLayout(new GridLayout());
                frame.setSize(550, 590);
                this.frame.getContentPane().add(sp);
                sp.grabFocus();
            } catch (Exception e) {
                System.out.println("File niet gevonden!");
            }
            this.frame.revalidate();
        }
    }

    public class Level3Class implements ActionListener {

        private JFrame frame;

        public Level3Class(JFrame frame) {
            this.frame = frame;
        }

        public void actionPerformed(ActionEvent l3) {
            try {
                URL url = getClass().getResource("Level3.txt");
                File file = new File(url.getPath());
                Speelveld sp = new Speelveld(file);
                this.frame.getContentPane().removeAll();
                frame.getContentPane().setLayout(new GridLayout());
                frame.setSize(550, 590);
                this.frame.getContentPane().add(sp);
                sp.grabFocus();
            } catch (Exception e) {
                System.out.println("File niet gevonden!");
            }
            this.frame.revalidate();
        }
    }

    public class ExitClass implements ActionListener {

        public void actionPerformed(ActionEvent ec) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        LlamaBarricade gui = new LlamaBarricade();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(800, 500);
        gui.getContentPane().setBackground(Color.PINK);
        gui.setTitle("Llamafun!");
        gui.setVisible(true);
    }

}
