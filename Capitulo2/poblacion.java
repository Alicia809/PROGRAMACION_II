/*2.34 (Calculadora del crecimiento de la población mundial) 
Use Web para determinar la población mundial actual y la tasa 
de crecimiento anual de la población mundial. Escriba una aplicación 
que reciba estos valores como entrada y luego muestre la población 
mundial estimada después de uno, dos, tres, cuatro y cinco años. */

import java.util.Scanner;

public class poblacion {
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
        double poblacion;
        double crecimiento;
        double uno;
        double dos;
        double tres;
        double cuatro;
        double cinco;
        // Población Mundial: 7.9 Billones de Personas
        // Tasa de creimiento anual: 1.0% =0.01


        System.out.print("Escriba la población mundial actual: ");
        poblacion = entrada.nextDouble();

        System.out.print("Escriba la tasa de crecimiento anual de la población mundial: ");
        crecimiento = entrada.nextDouble();
        uno =poblacion*(Math.pow(1+crecimiento,1));
        dos =poblacion*(Math.pow(1+crecimiento,2));
        tres =poblacion*(Math.pow(1+crecimiento,3));
        cuatro =poblacion*(Math.pow(1+crecimiento,4));
        cinco =poblacion*(Math.pow(1+crecimiento,5));
        
        System.out.printf("%s%f%s%n",
            "La población mundial estimada después de 1 año es: ", uno, " billones.");
        System.out.printf("%s%f%s%n",
            "La población mundial estimada después de 2 años es: ", dos, " billones.");
        System.out.printf("%s%f%s%n",
            "La población mundial estimada después de 3 años es: ", tres, " billones.");
        System.out.printf("%s%f%s%n",
            "La población mundial estimada después de 4 años es: ", cuatro, " billones.");
        System.out.printf("%s%f%s%n",
            "La población mundial estimada después de 5 años es: ", cinco, " billones.");
    }
    }
}