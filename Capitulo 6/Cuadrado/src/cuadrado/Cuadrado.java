/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado;

import java.util.Scanner;

/**
 *
 * @author Alicia Ulloa
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cuadradoDeAsteriscos cuadro = new cuadradoDeAsteriscos();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Especifique el lado: "); // indicador (promt)
        int mostrarLado = entrada.nextInt();
        cuadro.obtenerCuadrado((int) mostrarLado);
    }
    
}
