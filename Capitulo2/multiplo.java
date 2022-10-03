/*2.26 (Múltiplos) Escriba una aplicación que lea dos enteros, determine 
si el primero es un múltiplo del segundo e imprima el resultado. */

import java.util.Scanner;

public class multiplo {
    public static void main(String[] args)
  {
    try (Scanner entrada = new Scanner(System.in)) {
      int entero1;
      int entero2;
      float evaluacion;

      System.out.print("Escriba el primer entero: ");
      entero1 = entrada.nextInt();
      System.out.print("Escriba el segundo entero: ");
      entero2 = entrada.nextInt();

      evaluacion = entero1%entero2;
          
      if (evaluacion==0)
          System.out.printf("%d%s%d%n", entero1, " es multiplo de ", entero2);
       else 
          System.out.printf("%d%s%d%n", entero1, " no es multiplo de ", entero2);
    }

    }
}