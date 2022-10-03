/*4.23 (Encontrar los dos números más grandes) Utilizando una metodología similar 
a la del ejercicio 4.21, encuentre los dos valores más grandes de los 10 que se 
introdujeron. [Nota: puede introducir cada número sólo una vez]. */

import java.util.Scanner;

public class dos_mayores {
    public static void main(String[] args)
    {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero = 0;//el entero más reciente introducido por el usuario
            int mayor1 = 0;
            int mayor2 = 0;
            int contador = 1;

            while (contador <= 10) {
                System.out.print("Escriba el valor: "); 
                numero = entrada.nextInt();

                if (numero >= mayor1){
                    mayor2 = mayor1;
                    mayor1 = numero;
                }
                else
                    if(numero < mayor1 && numero >= mayor2){
                        mayor2 = numero;
                    }
                contador = contador + 1; 
            }
            System.out.printf("%s%d%n","El valor mas grande es: ", mayor1);
            System.out.printf("%s%d%n","El segundo valor mas grande es: ", mayor2);
        } 
    }   
}
