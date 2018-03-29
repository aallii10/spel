/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelfun;

/**
 * Superclass Functie: bewandelbaar (argument speler)
 *
 * @author donna
 */
public abstract class Tile {

    public abstract boolean isBewandelbaar(Speler speler1); // de vraag wordt gesteld. Antwoord halen bij subklassen. Geen default zetten dat is niet netjes. 

}
