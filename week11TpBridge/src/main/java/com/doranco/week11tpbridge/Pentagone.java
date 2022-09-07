/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpbridge;

/**
 *
 * @author JiJi
 */
public class Pentagone extends Forme{

    public Pentagone(Couleur couleur) {
        super(couleur);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagone colorie avec ");
        couleur.applyColor();
        
    }
   
}
