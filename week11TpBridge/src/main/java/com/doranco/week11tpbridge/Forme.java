/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpbridge;

/**
 *
 * @author JiJi
 */
public abstract class Forme {
    
        protected Couleur couleur;

    public Forme(Couleur couleur) {
        this.couleur = couleur;
    }

   
    
    abstract public void applyColor();
}
