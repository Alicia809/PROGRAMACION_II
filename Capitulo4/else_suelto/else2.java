import java.util.Scanner;

public class else2 {
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
            int x;
            int y;
            System.out.print("X: ");
            x = entrada.nextInt();

            System.out.print("Y: ");
            y = entrada.nextInt();

            if (y == 8){
                if (x == 5)
                    System.out.println("@@@@@");
                    else{
                        System.out.println("#####");
                        System.out.println("&&&&&");
                    }
            }
            System.out.println("$$$$$");
            

            /*b) Suponiendo que x = 5 y y = 8, se produce la siguiente salida:
                @@@@@
                $$$$$*/
        }
    }
}