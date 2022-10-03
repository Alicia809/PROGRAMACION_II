/*2.32 (Valores negativos, positivos y cero) 
Escriba un programa que reciba cinco números, y que determine 
e imprima la cantidad de números negativos, positivos, y la 
cantidad de ceros recibidos */

import java.util.Scanner;

public class signos {
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int negativos=0;
        int positivos=0;
        int ceros=0;

        System.out.print("Escriba el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.print("Escriba el tercer numero: ");
        numero3 = entrada.nextInt();

        System.out.print("Escriba el cuarto numero: ");
        numero4 = entrada.nextInt();

        System.out.print("Escriba el quinto numero: ");
        numero5 = entrada.nextInt();

        if (numero1<0)
        negativos+=1;
        if (numero2<0)
        negativos+=1;
        if (numero3<0)
        negativos+=1;
        if (numero4<0)
        negativos+=1;
        if (numero5<0)
        negativos+=1;

        if (numero1==0)
        ceros+=1;
        if (numero2==0)
        ceros+=1;
        if (numero3==0)
        ceros+=1;
        if (numero4==0)
        ceros+=1;
        if (numero5==0)
        ceros+=1;

        if (numero1>0)
        positivos+=1;
        if (numero2>0)
        positivos+=1;
        if (numero3>0)
        positivos+=1;
        if (numero4>0)
        positivos+=1;
        if (numero5>0)
        positivos+=1;

        System.out.printf("%s%d%s%n","Hay ", negativos, " negativos.");
        System.out.printf("%s%d%s%n","Hay ", positivos, " positivos.");
        System.out.printf("%s%d%s%n","Hay ", ceros, " ceros.");
        
    }
    }
}