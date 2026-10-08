/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */
public class Atleta {
    protected String nombre;
    protected int edad;
    protected String pais;

    public Atleta(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | País: " + pais;
    }
}
