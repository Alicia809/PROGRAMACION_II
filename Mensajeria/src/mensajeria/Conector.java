/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeria;
import java.net.*;
import java.io.*;
import mensajeria.ChatCliente;

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
public class Conector extends Thread{
    private Socket s;
    private ServerSocket ss;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int puerto = 4314;
    
    public Conector(String ip){
        try{
            this.s = new Socket(ip,this.puerto);
            
            //Creacion de entrada de datos para lectura de mensajes.
            this.entradaSocket = new InputStreamReader(s.getInputStream());
            this.entrada = new BufferedReader(entradaSocket);
            //Creacion de salida de datos para el envion de mensajes
            this.salida = new DataOutputStream(s.getOutputStream());
            //this.salida.writeUTF("Conectado\n");
            
       }catch(Exception e){};
        
    }
    
    public void run(){
        String texto;
        while(true){
            try{
                texto = entrada.readLine();
                ChatCliente.jTextArea1.setText(ChatCliente.jTextArea1.getText()+"Servidor: "+texto+"\n");
            }catch(IOException e){};
        }
    }
    
    public void enviarMSG(String msg){
        System.out.println("enviando...");
        try{
            this.salida = new DataOutputStream(s.getOutputStream());
            this.salida.writeUTF(msg+"\n");
        }catch(IOException e){}
        System.out.println("Problema al enviar");
        
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
