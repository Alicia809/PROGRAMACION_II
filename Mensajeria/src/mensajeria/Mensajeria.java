/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mensajeria;

//import mensajeria.*;
//import mensajeria.ChatCliente;

/**
 *
 * @author Alicia Ulloa
 */
public class Mensajeria {
    
    public static Conector cliente;
    public static void main(String[] args) {
        ChatCliente client = new ChatCliente();
        client.main();
        
    }
   
    public static void initCliente(String ip){
        cliente = new Conector(ip);
        cliente.start();
    }
    
}
