/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Competidor;
import vista.VistaMundial;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alex
 */
public class ControladorMundial {

    private List<Competidor> competidores;
    private VistaMundial vista;

    public ControladorMundial(VistaMundial vista) {
        this.competidores = new ArrayList<>();
        this.vista = vista;
    }

    public void iniciar() {
        int opcion = 0;
        while (opcion != 4) {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    registrarCompetidor();
                    break;
                case 2:
                    actualizarRanking();
                    break;
                case 3:
                    mostrarCompetidores();
                    break;
                case 4:
                    vista.mostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        }
    }

    private void registrarCompetidor() {
        String nombre = vista.pedirTexto("Nombre: ");
        int edad = vista.pedirEntero("Edad: ");
        String pais = vista.pedirTexto("País: ");
        int ranking = vista.pedirEntero("Ranking mundial: ");
        double estatura = vista.pedirDecimal("Estatura (m): ");
        double peso = vista.pedirDecimal("Peso (kg): ");

        Competidor c = new Competidor(nombre, edad, pais, ranking, estatura, peso);
        competidores.add(c);
        vista.mostrarMensaje("Competidor registrado correctamente.");
    }

    private void actualizarRanking() {
        if (competidores.isEmpty()) {
            vista.mostrarMensaje("No hay competidores registrados.");
            return;
        }

        mostrarCompetidores();
        int indice = vista.pedirEntero("Índice del competidor: ") - 1;

        if (indice < 0 || indice >= competidores.size()) {
            vista.mostrarMensaje("Índice inválido.");
            return;
        }

        int puntos = vista.pedirEntero("Puntos obtenidos: ");
        String respuesta = vista.pedirTexto("¿Ganó medalla? (s/n): ");

        Competidor c = competidores.get(indice);

        // SOBRECARGA en acción: llamamos a la versión de 2 parámetros si ganó medalla
        if (respuesta.equalsIgnoreCase("s")) {
            c.actualizarRanking(puntos, true);
        } else {
            c.actualizarRanking(puntos, false);
        }

        vista.mostrarMensaje("Ranking actualizado. Nuevo ranking: " + c.getRanking());
    }

    private void mostrarCompetidores() {
        if (competidores.isEmpty()) {
            vista.mostrarMensaje("No hay competidores registrados.");
            return;
        }
        vista.mostrarMensaje("=== Lista de Competidores ===");
        for (int i = 0; i < competidores.size(); i++) {
            vista.mostrarMensaje((i + 1) + ". " + competidores.get(i).toString());
        }
    }    
}
