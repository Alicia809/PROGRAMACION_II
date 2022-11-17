/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factu;

/**
 *
 * @author Alicia Ulloa
 */
// Fig. 3.8: Cuenta.java
  // La clase Cuenta con una variable de instancia double llamada saldo y un constructor
  // además de un método llamado deposito que realiza validación.
 
    public class Factura{
    private String numero; // variable de instancia
    private String descripcion; // variable de instancia
    private int cantidad; // variable de instancia
    private double precio; // variable de instancia
 
    // Constructor de Cuenta que recibe dos parámetros
    public Factura( String num, String descri, int canti, double precio)
    { 
    //this.nombre = nombre;
    this.numero = num; // asigna nombre a la variable de instancia nombre
    this.descripcion = descri;
    //this.cantidad = canti;
    //this.precio = precio;

    // valida que canti y precio sean mayor que 0.0; de lo contrario,
    // la variable de instancia saldo mantiene su valor inicial predeterminado de 0.0
    if (canti > 0) // si el saldo es válido
        this.cantidad = canti; // lo asigna a la variable de instancia saldo
    if (precio > 0.0)
        this.precio = precio; 
    }

    // método que que calcule el monto de la factura
    public void obtenerMontoFactura(double montoFactura, int montoPrecio)
    {
    if (montoFactura > 0 && montoPrecio > 0.0) // si el montoFctura es válido
    precio = montoFactura * montoPrecio;
    }
    
    /*public void establecerNombre(String nombre)
    {
    this.nombre = nombre;
    }

    public String obtenerNombre()
    {
    return nombre;
    }*/

    // método que establece el numero
    public void establecerNumero(String num)
    {
    this.numero = num;
    }

    // método que devuelve el numero
    public String obtenerNumero()
    {
    return numero; //devuelve el valor de name a quien lo invocó
    } // fin del método obtenerNumero
    
     // método
    public void establecerDescripcion(String descri)
    {
    this.descripcion = descri;
    }

    public String obtenerDescripcion()
    {
    return descripcion; 
    }
    
     // método
    public void establecerCantidad(int canti)
    {
    this.cantidad = canti;
    }

    public int obtenerCantidad()
    {
    return cantidad; 
    } 
    
     // método
    public void establecerPrecio(double precio)
    {
    this.precio = precio;
    }

    // método que devuelve el saldo de la cuenta
    public double obtenerPrecio()
    {
    return precio;
    }
    
} // fin de la clase Cuenta