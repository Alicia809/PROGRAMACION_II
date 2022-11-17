/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones_de_temperatura;

import java.util.Scanner;

/**
 *
 * @author Alicia Ulloa
 */


public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Metodos metodo = new Metodos();
       
       Scanner entrada = new Scanner(System.in);
        
       System.out.print("1. De Fahrenheit a Centigrados \n");
       System.out.print("2. De Centigrados a Fahrenheit \n");
       System.out.print("OPCION: ");
       int numero = entrada.nextInt();
       
       switch (numero){
            case 1:
                System.out.print("Grados Fahrenheit: ");
                int mostrarGrado1 = entrada.nextInt();
                metodo.Centigrados(mostrarGrado1);
            break;
            
            case 2:
                System.out.print("Grados Centigrados: ");
                int mostrarGrado2 = entrada.nextInt();
                metodo.Fahrenheit(mostrarGrado2);
            break;
            
            default:
                System.out.print("La opcion no era valida \n");
            break;
        }
    }
    
}
