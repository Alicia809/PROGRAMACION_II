/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factu;

/**
 *
 * @author Alicia Ulloa
 */

// Fig. 3.9: PruebaCuenta.java
// Entrada y salida de números de punto flotante con objetos Cuenta.
//Eliminar código duplicado en el método main
import java.util.Scanner;

public class PruebaFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura factu =new Factura("1", "Cliente", 0, -7.53);

        // muestra el saldo inicial de cada objeto
        mostrarCuenta(factu);

        // crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cantidad de articulos: "); // indicador (promt)
        double montoFactura = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.print("Precio individual: "); // indicador (promt)
        double montoPrecio = entrada.nextInt(); // obtiene entrada del usuario
        /*System.out.printf("%nsumando %.2f al saldo del comprador%n%n",
        montoFactura);*/
        factu.obtenerMontoFactura(montoFactura, (int) montoPrecio); // suma al saldo de cuenta1

        // muestra los saldos
        mostrarCuenta(factu);
        } // fin de main
        public static void mostrarCuenta(Factura cuentaAMostrar){
            System.out.printf("Saldo de %s: $%.2f%n",cuentaAMostrar.obtenerDescripcion(), cuentaAMostrar.obtenerPrecio()); 
            cuentaAMostrar.obtenerPrecio();
            //System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        }
    
 } // fin de la clase PruebaCuenta
