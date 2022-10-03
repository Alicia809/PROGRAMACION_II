/*4.36 (Lados de un triángulo rectángulo) Escriba una aplicación que lea tres enteros 
distintos de cero, y luego determine e imprima si éstos podrían representar los lados 
de un triángulo rectángulo */

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
            int lado1;
            int lado2;
            int lado3;
            
            System.out.print("Valor 1: ");
            lado1 = entrada.nextInt();

            System.out.print("Valor 2: ");
            lado2 = entrada.nextInt();

            System.out.print("Valor 3: ");
            lado3 = entrada.nextInt();

            if(Math.pow(lado1,2)+Math.pow(lado2,2)==Math.pow(lado3,2))
                System.out.print("Los valores ingresados pueden representar los lados de un triángulo rectángulo.");
            else
                if(Math.pow(lado1,2)+Math.pow(lado3,2)==Math.pow(lado2,2))
                    System.out.print("Los valores ingresados pueden representar los lados de un triángulo rectángulo.");
                else
                    if(Math.pow(lado2,2)+Math.pow(lado3,2)==Math.pow(lado1,2))
                        System.out.print("Los valores ingresados pueden representar los lados de un triángulo rectángulo.");
                    else
                    System.out.print("Los valores ingresados no pueden representan los lados de un triángulo rectángulo.");
        }
    }
}
