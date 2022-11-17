/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package delete;

/**
 *
 * @author Alicia Ulloa
 */

// Fig. 3.9: PruebaCuenta.java
// Entrada y salida de números de punto flotante con objetos Cuenta.
//Eliminar código duplicado en el método main
import java.util.Scanner;

public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        // muestra el saldo inicial de cada objeto
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        /*System.out.printf("Saldo de %s: $%.2f%n",
        cuenta1.obtenerNombre(), cuenta1.obtenerSaldo()); 
        cuenta1.obtenerSaldo();
        System.out.printf("Saldo de %s: $%.2f%n%n",
        cuenta2.obtenerNombre(), cuenta2.obtenerSaldo()); 
        cuenta2.obtenerSaldo();*/

        // crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador (promt)
        double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
        montoDeposito);
        cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1

        // muestra los saldos
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        /*System.out.printf("Saldo de %s: $%.2f%n",
        cuenta1.obtenerNombre(), cuenta1.obtenerSaldo()); 
        cuenta1.obtenerSaldo();
        System.out.printf("Saldo de %s: $%.2f%n%n",
        cuenta2.obtenerNombre(), cuenta2.obtenerSaldo()); 
        cuenta2.obtenerSaldo();*/

        System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador (promt)
        montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
        montoDeposito);
        cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2

        // muestra los saldos
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        /*System.out.printf("Saldo de %s: $%.2f%n",cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        cuenta1.obtenerSaldo();
        System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        cuenta2.obtenerSaldo();*/
        } // fin de main
    public static void mostrarCuenta(Cuenta cuentaAMostrar){
        System.out.printf("Saldo de %s: $%.2f%n",cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo()); 
        cuentaAMostrar.obtenerSaldo();
        //System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
    }
    
 } // fin de la clase PruebaCuenta
