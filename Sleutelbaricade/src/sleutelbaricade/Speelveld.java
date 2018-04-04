package sleutelbaricade;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Speelveld extends JPanel implements ActionListener {

    private Timer timer;

    private Level l;
    private Speler s;
    private Pad p;
    private Muur m;
    private Barricade b;
    private Sleutel sl;

    public Speelveld() {

        l = new Level();
        s = new Speler();
        p = new Pad();
        m = new Muur();
        sl = new Sleutel();
        b = new Barricade();

        addKeyListener(new Al());
        setFocusable(true);

        timer = new Timer(25, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {

        repaint();

    }

    public void paint(Graphics g) {
        super.paint(g);

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                //hier worden de objecten op het veld getekent
                if (l != null && l.getLevel(x, y) != null) {
                    switch (l.getLevel(x, y)) {
                        case "p":
                            g.drawImage(p.getPad(), x * 50, y * 50, 50, 50, null);
                            break;
                        case "m":
                            g.drawImage(m.getMuur(), x * 50, y * 50, 50, 50, null);
                            break;
                        case "1":
                            g.drawImage(sl.getSleutel(100), x * 50, y * 50, 50, 50, null);
                            break;
                        case "2":
                            g.drawImage(sl.getSleutel(200), x * 50, y * 50, 50, 50, null);
                            break;
                        case "3":
                            g.drawImage(sl.getSleutel(300), x * 50, y * 50, 50, 50, null);
                            break;
                        case "a":
                            g.drawImage(b.getBarricade(100), x * 50, y * 50, 50, 50, null);
                            break;
                        case "b":
                            g.drawImage(b.getBarricade(200), x * 50, y * 50, 50, 50, null);
                            break;
                        case "c":
                            g.drawImage(b.getBarricade(300), x * 50, y * 50, 50, 50, null);
                            break;
                        default:
                            break;
                    }
                }

            }

        }

        g.drawImage(s.getSpeler(), s.getPadX(), s.getPadY(), 50, 50, null);
    }

    public class Al extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();

            if (keycode == KeyEvent.VK_W) {

                if (s.getY() - 1 >= 0 && !levelEqualsUp("m")) {
                    if (!levelEqualsUp("a") && !levelEqualsUp("b") && (!levelEqualsUp("c") || (levelEqualsUp("c") && s.getSleutelCode() == 300)) || (levelEqualsUp("b") && s.getSleutelCode() == 200) || (levelEqualsUp("a") && s.getSleutelCode() == 100)) {
                        s.bewegen(0, -50, 0, -1);
                        setSleutel();
                    }
                }
            }
            if (keycode == KeyEvent.VK_S) {
                if (s.getY() + 1 <= 9 && !levelEqualsBottom("m")) {
                    if (!levelEqualsBottom("a") && !levelEqualsBottom("b") && (!levelEqualsBottom("c") || (levelEqualsBottom("c") && s.getSleutelCode() == 300)) || (levelEqualsBottom("b") && s.getSleutelCode() == 200) || (levelEqualsBottom("a") && s.getSleutelCode() == 100)) {
                        s.bewegen(0, 50, 0, 1);
                        setSleutel();
                    }
                }
            }
            if (keycode == KeyEvent.VK_A) {
                if (s.getX() - 1 >= 0 && !levelEqualsLeft("m")) {
                    if (!levelEqualsLeft("a") && !levelEqualsLeft("b") && (!levelEqualsLeft("c") || (levelEqualsLeft("c") && s.getSleutelCode() == 300)) || (levelEqualsLeft("b") && s.getSleutelCode() == 200) || (levelEqualsLeft("a") && s.getSleutelCode() == 100)) {
                        s.bewegen(-50, 0, -1, 0);
                        setSleutel();
                    }
                }
            }
            if (keycode == KeyEvent.VK_D) {
                if (s.getX() + 1 <= 9 && !levelEqualsRight("m")) {
                    if (!levelEqualsRight("a") && !levelEqualsRight("b") && (!levelEqualsRight("c") || (levelEqualsRight("c") && s.getSleutelCode() == 300)) || (levelEqualsRight("b") && s.getSleutelCode() == 200) || (levelEqualsRight("a") && s.getSleutelCode() == 100)) {

                        s.bewegen(50, 0, 1, 0);
                        setSleutel();

                    }
                }
            }
        }
    }

        private void setSleutel() {
        if (l.getLevel(s.getX(), s.getY()).equals("3")) {
            s.setSleutelCode(300);
            l.setLevelAsPath(s.getX(), s.getY());
        } else if (l.getLevel(s.getX(), s.getY()).equals("2")) {
            s.setSleutelCode(200);
            l.setLevelAsPath(s.getX(), s.getY());
        } else if (l.getLevel(s.getX(), s.getY()).equals("1")) {
            s.setSleutelCode(100);
            l.setLevelAsPath(s.getX(), s.getY());
        }
    }


    private boolean levelEqualsUp(String str) {
        return l.getLevel(s.getX(), s.getY() - 1).equals(str);
    }

    private boolean levelEqualsBottom(String str) {
        return l.getLevel(s.getX(), s.getY() + 1).equals(str);
    }

    private boolean levelEqualsLeft(String str) {
        return l.getLevel(s.getX() - 1, s.getY()).equals(str);
    }

    private boolean levelEqualsRight(String str) {
        return l.getLevel(s.getX() + 1, s.getY()).equals(str);
    }

}
