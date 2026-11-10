/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_polimorfismo;

/**
 *
 * @author laboratorioasu
 */


public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override // (3) Anotación de sobreescritura
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau!");
    }
}
