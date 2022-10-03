/*5.33 (Crecimiento de la base de usuarios de Facebook) De acuerdo con CNNMoney.com,
Facebook llegó a los mil millones de usuarios en octubre de 2012. Use la técnica del 
cálculo del crecimiento compuesto que aprendió en lafigura 5.6 y, suponiendo que su base 
de usuarios crezca con una tasa del 4% mensual, ¿cuántos meses tardará 
Facebook en aumentar su base de usuarios a mil quinientos millones? 
¿Cuántos meses tardará Facebook en aumentar su base de usuarios a dos mil millones?*/

public class crecimiento{
    public static void main(String[] args){
        double aumento; // monto depositado al final de cada año
        double principal = 1000000000.0; // monto inicial antes de los intereses
        double tasa = 0.04;

        System.out.printf("%s%20s%n", "Mes", "Crecimiento");

        // calcula el aumento de usuarios para cada uno de meses
        for (int mes = 1; mes <= 24; ++mes){
            // calcula el nuevo aumento para el mes especificado
            aumento = principal * Math.pow(1.0 + tasa, mes);
              
            // muestra el año y el monto
            System.out.printf("%4d%,20.2f%n", mes, aumento);
        } 
        System.out.println("\nTardará 11 meses en llegar a los mil quinientos millones. ");
        System.out.println("Tardará 18 meses en llegar a los dos mil millones. ");
        } 
 }
