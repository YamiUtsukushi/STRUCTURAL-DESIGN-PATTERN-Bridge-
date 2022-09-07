/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpbridge;

/**
 *
 * @author JiJi
 */
public class Triangle extends Forme{

    public Triangle(Couleur couleur) {
        super(couleur);
    }
    
    

    @Override
    public void applyColor() {
        
        System.out.println("Triangle colorie avec ");
        couleur.applyColor();
    }
    

}
