/*5.12 (Calcular el producto de enteros impares) Escriba una aplicación que 
calcule el producto de los enteros impares del 1 al 15. */
public class producto {
    public static void main(String[] args)
    {
        int total=1;

        for (int entero = 1; entero <= 15; entero += 2)
            total *= entero;

        System.out.printf("El producto es %d%n", total); 
    }
}
