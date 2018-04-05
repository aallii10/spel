package sleutelbaricade;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Speelveld extends JPanel implements ActionListener {

    private final Timer timer;

    private final Level l;
    private final Speler s;
    private final Pad p;
    private final Muur m;
    private final Barricade b;
    private final Sleutel sl;
    private final Eindveld e;

    public Speelveld() {

        l = new Level();
        s = new Speler();
        p = new Pad();
        m = new Muur();
        sl = new Sleutel();
        b = new Barricade();
        e = new Eindveld();

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
                        case "e":
                            g.drawImage(e.getEindveld(), x * 50, y * 50, 50, 50, null);
                            break;
                        default:
                            g.drawImage(p.getPad(), x * 50, y * 50, 50, 50, null);
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

            //Als de speler op het eindveld komt heeft die gewonnen
            if (keycode == KeyEvent.VK_W) {

                if (s.getY() - 1 >= 0 && !levelEqualsUp("m")) {

                    if ((levelEqualsUp("c") && s.getSleutelCode() == 300) || (levelEqualsUp("b") && s.getSleutelCode() == 200) || (levelEqualsUp("a") && s.getSleutelCode() == 100)) {

                        s.bewegen(0, -50, 0, -1);
                        setLevelPath();
                    } else if (!levelEqualsUp("c") && !levelEqualsUp("b") && !levelEqualsUp("a")) {
                        s.bewegen(0, -50, 0, -1);
                        setSleutel();
                        setLevelPath();
                    }
                }

            }
            if (keycode == KeyEvent.VK_S) {
                if (s.getY() + 1 <= 9 && !levelEqualsBottom("m")) {

                    if ((levelEqualsBottom("c") && s.getSleutelCode() == 300) || (levelEqualsBottom("b") && s.getSleutelCode() == 200) || (levelEqualsBottom("a") && s.getSleutelCode() == 100)) {

                        s.bewegen(0, 50, 0, 1);
                        setLevelPath();
                    } else if (!levelEqualsBottom("c") && !levelEqualsBottom("b") && !levelEqualsBottom("a")) {

                        {
                            s.bewegen(0, 50, 0, 1);
                            setSleutel();
                            setLevelPath();
                            //System.out.println("y is" + s.getY());
                            //System.out.println("x is" + s.getX());
                        }
                    }

                }
            }
            if (keycode == KeyEvent.VK_A) {
                if (s.getX() - 1 >= 0 && !levelEqualsLeft("m")) {

                    if ((levelEqualsLeft("c") && s.getSleutelCode() == 300) || (levelEqualsLeft("b") && s.getSleutelCode() == 200) || (levelEqualsLeft("a") && s.getSleutelCode() == 100)) {

                        s.bewegen(-50, 0, -1, 0);
                        setLevelPath();
                    } else if (!levelEqualsLeft("c") && !levelEqualsLeft("b") && !levelEqualsLeft("a")) {
                        s.bewegen(-50, 0, -1, 0);
                        setSleutel();
                        setLevelPath();

                    }

                }
            }
            if (keycode == KeyEvent.VK_D) {
                if (s.getX() + 1 <= 9 && !levelEqualsRight("m")) {

                    if ((levelEqualsRight("c") && s.getSleutelCode() == 300) || (levelEqualsRight("b") && s.getSleutelCode() == 200) || (levelEqualsRight("a") && s.getSleutelCode() == 100)) {

                        s.bewegen(50, 0, 1, 0);
                        setLevelPath();
                    } else if (!levelEqualsRight("c") && !levelEqualsRight("b") && !levelEqualsRight("a")) {
                        s.bewegen(50, 0, 1, 0);
                        setSleutel();
                        setLevelPath();
                    }

                }
            }

            if (s.getY() == 9 && s.getX() == 9) {
                System.out.println("gewonnen");
                int input = JOptionPane.showOptionDialog(null, "Hello World", "The title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

                if (input == JOptionPane.OK_OPTION) {
                    
                }
                timer.stop();
            }
        }
    }

    private void setLevelPath() {
        l.setLevelAsPath(s.getX(), s.getY());
    }

    private void setSleutel() {
        switch (l.getLevel(s.getX(), s.getY())) {
            case "3":
                s.setSleutelCode(300);
                break;
            case "2":
                s.setSleutelCode(200);
                break;
            case "1":
                s.setSleutelCode(100);
                break;
            default:
                break;
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
