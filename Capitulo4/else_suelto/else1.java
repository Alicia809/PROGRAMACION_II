/*4.28 (Otro problema de else suelto) Modifique el código dado para producir 
la salida que se muestra en cada parte del problema. Utilice las técnicas de 
sangría apropiadas. No haga modificaciones en el código, sólo inserte llaves 
o modifique la sangría del código.*/

import java.util.Scanner;

public class else1 {
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
            int x;
            int y;
            System.out.print("X: ");
            x = entrada.nextInt();

            System.out.print("Y: ");
            y = entrada.nextInt();

            if (y == 8)
                if (x == 5)
                    System.out.println("@@@@@");
            else
                System.out.println("#####");

            System.out.println("$$$$$");
            System.out.println("&&&&&");

            /*a) Suponiendo que x = 5 y y = 8, se produce la siguiente salida:
                @@@@@
                $$$$$
                &&&&&*/
        }
    }
}
