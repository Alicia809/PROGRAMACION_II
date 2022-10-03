/*4.21 Escriba un programa en seudocódigo y después una aplicación en Java que reciba 
como entrada una serie de 10 números enteros, y que determine e imprima el mayor 
de los números. Su programa debe utilizar cuando menos las siguientes tres variables:
a) contador: un contador para contar hasta 10 
(para llevar el registro de cuántos números se han introducido, y para determinar 
cuando se hayan procesado los 10 números).
b) numero: el entero más reciente introducido por el usuario.
c) mayor: el número más grande encontrado hasta ahora. */

import java.util.Scanner; // el programa usa la clase Scanner

    public class mayor
    {
    public static void main(String[] args)
    {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero = 0;//el entero más reciente introducido por el usuario
            int mayor = 0;
            int contador = 1;

            while (contador <= 10) {
                System.out.print("Escriba el valor: "); 
                numero = entrada.nextInt();
                if (numero > mayor){
                    mayor = numero; 
                }
                
                contador = contador + 1; 
            }
            System.out.printf("%s%d%n","El valor mas grande es: ", mayor);
        } 
    }   
}