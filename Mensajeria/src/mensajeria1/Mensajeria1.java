/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mensajeria1;

//import mensajeria.*;
//import mensajeria1.ChatServidor;

/**
 *
 * @author Alicia Ulloa
 */
public class Mensajeria1 {
    
    public static Conector1 servidor;
    public static void main(String[] args) {
        ChatServidor server = new ChatServidor();
        server.main();
        
    }
    
    public static void initServer(String nombre){
        servidor = new Conector1(nombre);
        servidor.start();
    }
}
