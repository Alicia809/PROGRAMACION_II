/*2.25 (Par o impar) Escriba una aplicación que lea un entero y que 
determine e imprima si es impar o par */

import java.util.Scanner;

public class par_impar {
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
            int entero;
            int evaluacion;

            System.out.print("Escriba el entero: ");
            entero = entrada.nextInt();

            evaluacion = entero%2;

            if (evaluacion==0)
            System.out.printf("%d%s%n", entero, " es par.");
            if (evaluacion==1)
            System.out.printf("%d%s%n", entero, " es impar.");
        }
    }
}
