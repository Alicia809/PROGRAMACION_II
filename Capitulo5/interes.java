/*5.14 (Programa modificado del interés compuesto) Modifique la aplicación de interés 
compuesto de la figura 5.6, repitiendo sus pasos para las tasas de interés del 
5, 6, 7, 8, 9 y 10%. Use un ciclo for para variar la tasa de interés. */

public class interes{
    public static void main(String[] args){
        double monto; // monto depositado al final de cada año
        double principal = 1000.0; // monto inicial antes de los intereses

        // calcula el monto en depósito para cada uno de diez años
        for (double tasa = 0.05; tasa <= 0.1; tasa+=0.01){
            System.out.printf("%s%20s%20s%f%n", "Anio", "Monto en deposito",
            "Tasa de interés ",tasa);
            for (int anio = 1; anio <= 10; ++anio){
                // calcula el nuevo monto para el año especificado
                monto = principal * Math.pow(1.0 + tasa, anio);
                // muestra el año y el monto
                System.out.printf("%4d%,20.2f%n", anio, monto);
            }
            System.out.println();
        } 
    } 
 } 