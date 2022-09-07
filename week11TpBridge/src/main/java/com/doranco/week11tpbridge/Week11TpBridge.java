/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.doranco.week11tpbridge;

/**
 *
 * @author JiJi
 */
public class Week11TpBridge {

    public static void main(String[] args) {
        
        
        Forme tri = new Triangle(new CouleurRouge());
        tri.applyColor();
        
        Forme penta = new Pentagone(new CouleurVert());
        penta.applyColor();
        
        Forme car = new Carre(new CouleurJaune());
        car.applyColor();
        
        
    }
}
