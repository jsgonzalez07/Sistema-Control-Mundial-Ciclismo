/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alex
 */
public class Competidor extends Atleta {
    private int ranking;
    private double estatura;
    private double peso;
    private int puntos;

    public Competidor(String nombre, int edad, String pais,
                      int ranking, double estatura, double peso) {
        super(nombre, edad, pais);
        this.ranking = ranking;
        this.estatura = estatura;
        this.peso = peso;
        this.puntos = 0;
    }
    public int getRanking() { return ranking; }
    public void setRanking(int ranking) { this.ranking = ranking; }

    public double getEstatura() { return estatura; }
    public void setEstatura(double estatura) { this.estatura = estatura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public int getPuntos() { return puntos; }

    @Override
    public String toString() {
        return super.toString() +
               " | Ranking: " + ranking +
               " | Estatura: " + estatura +
               " | Peso: " + peso +
               " | Puntos: " + puntos;
    }
    
    public void actualizarRanking(int puntosObtenidos) {
        this.puntos += puntosObtenidos;
        this.ranking = Math.max(1, this.ranking - puntosObtenidos);
    }    
}
