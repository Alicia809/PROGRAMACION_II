/*2.16 (Comparación de enteros) Escriba una aplicación que pida al usuario que escriba dos enteros,
 que obtengalos números del usuario y muestre el número más grande, 
 seguido de las palabras “es más grande”. Si los números son 
 iguales, imprima el mensaje “Estos números son iguales”. */

  import java.util.Scanner; // el programa utiliza la clase Scanner
 
  public class comparacion
  {
    public static void main(String[] args)
    {
    try (// crea objeto Scanner para obtener la entrada de la ventana de comandos
    Scanner entrada = new Scanner(System.in)) {
      int numero1; // primer número a comparar
      int numero2; // segundo número a comparar

      System.out.print("Escriba el primer entero: "); // indicador
      numero1 = entrada.nextInt(); // lee el primer número del usuario

      System.out.print("Escriba el segundo entero: "); // indicador
      numero2 = entrada.nextInt(); // lee el segundo número del usuario

      if (numero1 > numero2)
      System.out.printf("%d%s%n", numero1, " es más grande.");
      
      if (numero1 < numero2)
      System.out.printf("%d%s%n", numero2, " es más grande.");

      if (numero1 == numero2)
      System.out.println("Estos números son iguales.");
    }
    } // fin del método main
 } // fin de la clase comparacion
