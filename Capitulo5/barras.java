/*5.16 (Programa para imprimir gráficos de barra) Escriba una aplicación que lea cinco números,
cada uno entre 1 y 30. Por cada número leído, su programa debe mostrar el mismo número de 
asteriscos adyacentes.Muestre las barras de asteriscos después de leer los cinco números. */

import java.util.Scanner;

    public class barras
    {
    public static void main(String[] args)
    {

        try (Scanner entrada = new Scanner(System.in)) {
            int num1;
            int num2;
            int num3;
            int num4;
            int num5;
            int cuenta;
            System.out.println("Ingrese cinco numeros entre 1 y 30");

            System.out.print("Numero 1: "); 
            num1 = entrada.nextInt();
            if (num1>30 || num1<1){
                System.out.println("El numero esta fuera del rago.");
            }
            while(num1>30 || num1<1){
                System.out.println("Ingrese un numero entre 1 y 30");
                System.out.print("Numero 1: "); 
                num1 = entrada.nextInt();
            }

            System.out.print("Numero 2: "); 
            num2 = entrada.nextInt();
            if (num2>30 || num2<1){
                System.out.println("El numero esta fuera del rago.");
            }
            while(num2>30 || num2<1){
                System.out.println("Ingrese un numero entre 1 y 30");
                System.out.print("Numero 2: "); 
                num2 = entrada.nextInt();
            }

            System.out.print("Numero 3: "); 
            num3 = entrada.nextInt();
            if (num3>30 || num3<1){
                System.out.println("El numero esta fuera del rago.");
            }
            while(num3>30 || num3<1){
                System.out.println("Ingrese un numero entre 1 y 30");
                System.out.print("Numero 3: "); 
                num3 = entrada.nextInt();
            }

            System.out.print("Numero 4: "); 
            num4 = entrada.nextInt();
            if (num4>30 || num4<1){
                System.out.println("El numero esta fuera del rago.");
            }
            while(num4>30 || num4<1){
                System.out.println("Ingrese un numero entre 1 y 30");
                System.out.print("Numero 4: "); 
                num4 = entrada.nextInt();
            }

            System.out.print("Numero 5: "); 
            num5 = entrada.nextInt();
            if (num5>30 || num5<1){
                System.out.println("El numero esta fuera del rago.");
            }
            while(num5>30 || num5<1){
                System.out.println("Ingrese un numero entre 1 y 30");
                System.out.print("Numero 5: "); 
                num5 = entrada.nextInt();
            }

            for (cuenta = 1; cuenta <= num1; cuenta++){
                System.out.print("*");
            }
            System.out.println();

            for (cuenta = 1; cuenta <= num2; cuenta++){
                System.out.print("*");
            }
            System.out.println();

            for (cuenta = 1; cuenta <= num3; cuenta++){
                System.out.print("*");
            }
            System.out.println();

            for (cuenta = 1; cuenta <= num4; cuenta++){
                System.out.print("*");
            }
            System.out.println();

            for (cuenta = 1; cuenta <= num5; cuenta++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }   
}