/*2.30 (Separación de los dígitos en un entero)
Escriba una aplicación que reciba del usuario un número compuesto
por cinco dígitos, que separe ese número en sus dígitos individuales 
y los imprima, cada uno separado de los demás por tres espacios. */

import java.util.Scanner;

public class separacion {
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
        int numero;
        int d1;
        int d2;
        int d3;
        int d4;
        int d5;

        System.out.print("Escriba el numero: ");
        numero = entrada.nextInt();

        d5=numero%10;
        numero/=10;
        d4=numero%10;
        numero/=10;
        d3=numero%10;
        numero/=10;
        d2=numero%10;
        numero/=10;
        d1=numero%10;
        numero/=10;
        if (numero!=0)
        System.out.println("El numero tiene mas de cinco digitos.");
        else
            if (numero==0)
                System.out.printf("%d%s%d%s%d%s%d%s%d%n", d1, "   ", d2,"   ", d3,"   ", d4,"   ", d5);
        
        if(d1==0)
            System.out.println("El numero tiene menos de cinco digitos.");
        }
    }
}
