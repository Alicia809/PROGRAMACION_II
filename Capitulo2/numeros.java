/*2.14 Muestra los números del 1 al 4 en la misma línea, con cada 
par de números adyacentes separado por un espacio */

public class numeros
{
    public static void main(String[] args)
    {
        // a) Mediante una instrucción System.out.println.
        System.out.println("12 34");

        //b) Mediante cuatro instrucciones System.out.print.
        System.out.print("1");
        System.out.print("2 ");
        System.out.print("3");
        System.out.print("4 \n");

        //c) Mediante una instrucción System.out.printf.
        System.out.printf("%d%d%s%d%d%n",1,2," ",3,4);

    } // fin del método main
} // fin de la clase Suma