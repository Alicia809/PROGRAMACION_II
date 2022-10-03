/*2.17 (Aritmética: menor y mayor) Escriba una aplicación que reciba tres enteros del usuario 
y muestre la suma, promedio, producto, menor y mayor de esos números.*/
/*Nota: el cálculo del promedio en este ejercicio debe 
dar como resultado una representación entera del promedio */

import java.util.Scanner; // el programa utiliza la clase Scanner
 
public class arit_menymay
{
  public static void main(String[] args)
  {
  try (// crea objeto Scanner para obtener la entrada de la ventana de comandos
  Scanner entrada = new Scanner(System.in)) {
    int numero1; // primer número a comparar
    int numero2; // segundo número a comparar
    int numero3;
    int suma;
    int promedio;
    int producto;

    System.out.print("Escriba el primer entero: "); // indicador
    numero1 = entrada.nextInt(); // lee el primer número del usuario

    System.out.print("Escriba el segundo entero: ");
    numero2 = entrada.nextInt(); 

    System.out.print("Escriba el tercer entero: ");
    numero3 = entrada.nextInt();
    
    suma = numero1+numero2+numero3;
    promedio = (numero1+numero2+numero3)/3;
    producto = numero1*numero2*numero3;
    
    System.out.printf("La suma es: %d%n", suma);
    System.out.printf("El promedio es: %d%n", promedio);
    System.out.printf("El producto es: %d%n", producto);

    if (numero1 > numero2 && numero1 > numero3)
    System.out.printf("%d%s%n", numero1, " es el mayor.");
    if (numero1 < numero2 && numero1 < numero3)
    System.out.printf("%d%s%n", numero1, " es el menor.");
    
    if (numero2 > numero1 && numero2 > numero3)
    System.out.printf("%d%s%n", numero2, " es el mayor.");
    if (numero2 < numero1 && numero2 < numero3)
    System.out.printf("%d%s%n", numero2, " es el menor.");
    
    if (numero3 > numero1 && numero3 > numero2)
    System.out.printf("%d%s%n", numero3, " es el mayor.");
    if (numero3 < numero1 && numero3 < numero2)
    System.out.printf("%d%s%n", numero3, " es el menor.");

    if (numero1 == numero2 && numero1 < numero3)
    System.out.printf("%d%s%n", numero1, " es el menor.");
    if (numero1 == numero2 && numero1 > numero3)
    System.out.printf("%d%s%n", numero1, " es el mayor.");

    if (numero1 == numero3 && numero1 < numero2)
    System.out.printf("%d%s%n", numero1, " es el menor.");
    if (numero1 == numero3 && numero1 > numero2)
    System.out.printf("%d%s%n", numero1, " es el mayor.");

    if (numero2 == numero3 && numero2 < numero1)
    System.out.printf("%d%s%n", numero2, " es el menor.");
    if (numero2 == numero3 && numero2 > numero1)
    System.out.printf("%d%s%n", numero2, " es el mayor.");
  }

  } // fin del método main
} // fin de la clase comparacion