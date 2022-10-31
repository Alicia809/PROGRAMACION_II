/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeria1;
import java.net.*;
import java.io.*;
import mensajeria1.ChatServidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Alicia Ulloa
 */
public class Conector1 extends Thread{
    private Socket s;
    private ServerSocket ss;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int puerto = 4314;
    
    public Conector1(String nombre){
        super(nombre);
        
    }
    
    public void enviarMSG(String msg){
        try{
            this.salida.writeUTF(msg+"\n");
        }catch(IOException e){};
        
    }
    
    @SuppressWarnings("empty-statement")
     public void run(){
        String text;
        try{
            this.ss = new ServerSocket(puerto);
            this.s = ss.accept();
            
            //Creacion de entrada de datos para lectura de mensajes.
            this.entradaSocket = new InputStreamReader(s.getInputStream());
            this.entrada = new BufferedReader(entradaSocket);
            //Creacion de salida de datos para el envion de mensajes
            this.salida = new DataOutputStream(s.getOutputStream());
            
            while(true){
                text = this.entrada.readLine();
                System.out.println(text);
                ChatServidor.textAreaServer.setText(ChatServidor.textAreaServer.getText()/*"Cliente: "*/+text+"\n");
            }
        }catch(IOException e){};
        System.out.println("Algun tipo de error ha sucedido");
    }
    
    public String leerMSG(){
        try{
           return entrada.readLine();
        }catch(IOException e){};
        return null;
    } 
    
    public void desconectar(){
        try{
           s.close();
        }catch(Exception e){};
        try{
           ss.close();
        }catch(Exception e){};
    }
}
