/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelfun;

/**
 *
 * @author donna
 */
public class Barricade extends Tile {

    private int barricadeCode;

    public Barricade(int bcode) {
        this.barricadeCode = bcode;
    }

    //Speler-sleutel = heb jij een sleutel? Sleutel-barricade = kan ik jou openmaken?// 
    @Override //sleutel aan speler vragen
    public boolean isBewandelbaar(Speler speler1) {
        if (speler1.getSleutelcode() == barricadeCode) {
            return true;
        } else {
            return false; 
        }
        /*Indien sleutelcode = barricadecode -> true. Else return false.*/
    }

    //ipv barricade wordt path-> boolean bijhouden of de barricade is geopend ja nee. Ander methode. 
}
