/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelfun;

/**
 * KeyTile
 *
 * @author donna
 */
public class Key extends Tile {

    private int sleutelcode;
    private boolean sleutelchecker;

    public Key(int scode) { // want sleutelcode veranderd nooit.
        this.sleutelcode = scode;
        this.sleutelchecker = true; // De sleutel ligt te liggen en er is niks mee gebeurd. 
    }

    @Override
    public boolean isBewandelbaar(Speler speler1) {
        return true;
    }

    /*Sleutelchecker is hier of er een sleutel op het spelveld ligt ja/nee. Indien de speler hierover
    loopt en er ligt een sleutel (standaard op true), dan wordt deze code in de setSleutel methode
    van de Speler opgeslagen. Vervolgens wordt de staat op false gezet. Indien de speler er niet overheen loopt
    gebeurd er niks; dus geen else.*/
    @Override
    public void bewandelTegel(Speler speler1) { //We
        if (sleutelchecker) {
            speler1.setSleutelcode(sleutelcode);
            sleutelchecker = false;
        }

    }

}
