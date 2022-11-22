/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instrucciones;

import java.util.Scanner;

/**
 *
 * @author Alicia Ulloa
 */
public class Instrucciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
       System.out.print("1. Asignar cero a los 10 elementos del arreglo cuentas de tipo entero. \n");
       System.out.print("2. Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero. \n");
       System.out.print("3. Imprima los cinco valores del arreglo mejoresPuntuaciones de tipo entero en formato de columnas. \n");
       System.out.print("OPCION: ");
       int numero = entrada.nextInt();
       
       switch (numero){
            case 1:
                // declara la variable cuentas y la inicializa con un objeto arreglo
                int[] cuentas = new int[10]; // crea el objeto arreglo

                System.out.printf("%s%8s%n", "Elemento", "Valor"); // encabezados de columnas

                // imprime el valor de cada elemento del arreglo
                for (int contador = 0; contador < cuentas.length; contador++)
                System.out.printf("%5d%8d%n", contador, cuentas[contador]);
                
            break;
            
            case 2:
                // declara la variable cuentas y la inicializa con un objeto arreglo
                int[] bono = new int[15]; // crea el objeto arreglo

                System.out.printf("%s%8s%n", "Elemento", "Valor"); // encabezados de columnas

                // imprime el valor de cada elemento del arreglo
                for (int contador = 0; contador < bono.length; contador++)
                System.out.printf("%5d%8d%n", contador, bono[contador]+1);
            break;
            
            case 3:
                // la lista inicializadora especifica el valor para cada elemento
                int[] mejoresPuntuaciones = { 98, 98, 96, 95, 92};

                System.out.printf("%s%n", "Puntuacion"); // encabezados de columnas

                // imprime el valor de cada elemento del arreglo
                for (int contador = 0; contador < mejoresPuntuaciones.length; contador++)
                System.out.printf("%5d%n", mejoresPuntuaciones[contador]);
            break;
            
            default:
                System.out.print("La opcion no era valida \n");
            break;
        }
    }
    
}
