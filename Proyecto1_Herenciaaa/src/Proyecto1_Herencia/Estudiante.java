/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1_Herencia;

/**
 *
 * @author laboratorioasu
 */


public class Estudiante extends Persona {
    private String carrera;
    
    public Estudiante(String nombre, String carrera) {
        super(nombre); 
        this.carrera = carrera;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre + " | Carrera: " + carrera);
    }
}
