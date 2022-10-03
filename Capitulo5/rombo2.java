/*5.25 (Programa modificado para imprimir rombos) Aplicación que lea un número impar en 
el rango de 1 a 19, de manera que especifique el número de filas en el rombo.
Su programa debe entonces mostrar un rombo del tamaño apropiado. */

import java.util.Scanner;

public class rombo2 {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            
            System.out.print("Numero impar de filas en el rango 1-19: ");
            int numero = entrada.nextInt();
            if (numero<1 || numero>19)
                System.out.print("El numero esta fuera del rango (1-19)");
            else
                if (numero<=19 && numero%2==1){
                    int extremo= (numero+1)/2;
                    int extremo2= (numero-1)/2;

                    int contador=1;
                    int limite1=extremo;
                    int limite2=1;
                    
                    while(contador<=extremo){
                        for (int dato = 1; dato <= limite1; dato++)
                            System.out.print(" ");

                        for (int dato2 = 1; dato2 <= limite2; dato2++)
                            System.out.print("*");
                        
                        System.out.println();
                        limite1--;
                        limite2+=2;
                        contador++;
                    }

                    int contador2=1;
                    int limite3=extremo2;
                    int limite4=1;

                    while(contador2<=extremo2){
                        for (int dato3 = (numero/2)+1; dato3 >= limite3; dato3--)
                            System.out.print(" ");

                        for (int dato4 = numero-2; dato4 >= limite4; dato4--)
                            System.out.print("*");
                        
                        System.out.println();
                        limite3--;
                        limite4+=2;
                        contador2++;
                    }
                }
                else 
                    System.out.print("El numero es par.");
        }
    }
}