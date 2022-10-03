/*2.15 (Aritmética) Escriba una aplicación que pida al usuario que escriba dos números, 
que obtenga los números del usuario e imprima la suma, producto, 
diferencia y cociente (división) de los números.  */
 
import java.util.Scanner; // el programa usa la clase Scanner

 public class aritmetica
 {
    public static void main(String[] args)
    {
    /*crea objeto Scanner para obtener la entrada de 
    la ventana de comandos */
    try (Scanner entrada = new Scanner(System.in)) {
        int numero1; // primer número a sumar
        int numero2; // segundo número a sumar
        int suma; // suma de numero1 y numero2
        int producto; //multiplicacion de los numeros
        int diferencia; //resta de los numeros
        int cociente; // division de los numeros

        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario

        System.out.print("Escriba el segundo entero: "); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario

        suma = numero1 + numero2; // suma los números, después almacena el total en suma
        producto = numero1 * numero2;
        diferencia = numero1 - numero2;
        cociente = numero1 / numero2;

        System.out.printf("La suma es: %d%n", suma);
        System.out.printf("El producto es: %d%n", producto);
        System.out.printf("La diferencia es: %d%n", diferencia);
        System.out.printf("El cociente es: %d%n", cociente);
    }
    } // fin del método main
 } // fin de la clase
