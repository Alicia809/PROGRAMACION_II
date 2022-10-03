/*4.31 (Imprimir el equivalente decimal de un número binario) Escriba una aplicación que 
reciba como entrada un entero que contenga sólo dígitos 0 y 1 (es decir, un entero binario), 
y que imprima su equivalente decimal. [Sugerencia: use los operadores residuo y división 
para elegir los dígitos del número binario uno a la vez, de derecha a izquierda. */

import java.util.Scanner;

public class binario {
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
            int binario;
            int pot=0;
            int suma=0;
            
            System.out.print("Entero binario: ");
            binario = entrada.nextInt();

            while (binario>0){
                suma=(int) (suma+((binario % 10)*(Math.pow(2,pot))));
                binario=binario/10;
                pot=pot+1;
            }

            System.out.printf("Decimal: %d%n", suma);
        }
    }
}
