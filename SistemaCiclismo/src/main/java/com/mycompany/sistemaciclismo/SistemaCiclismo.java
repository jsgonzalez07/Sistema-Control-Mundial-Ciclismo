/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaciclismo;

import controlador.ControladorMundial;
import vista.VistaMundial;

/**
 *
 * @author juans
 */
public class SistemaCiclismo {

    public static void main(String[] args) {
        VistaMundial vista = new VistaMundial();
        ControladorMundial controlador = new ControladorMundial(vista);
        controlador.iniciar();
    }
}
