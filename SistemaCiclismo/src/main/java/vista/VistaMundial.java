/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class VistaMundial {
    private Scanner scanner;

    public VistaMundial() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n=== SISTEMA MUNDIAL DE CICLISMO DE PISTA ===");
        System.out.println("1. Registrar competidor");
        System.out.println("2. Actualizar ranking");
        System.out.println("3. Mostrar competidores");
        System.out.println("4. Salir");
        System.out.print("Opcion: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(scanner.nextLine());
    }

    public double pedirDecimal(String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(scanner.nextLine());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }    
}
