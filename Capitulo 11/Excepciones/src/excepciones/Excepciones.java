/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author Alicia Ulloa
 */
//Atrapar excepciones con las superclases

public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario, contraseña, confcontraseña;
        
        usuario= "Alicia Ulloa";
        contraseña= "543211";
        confcontraseña= "543211";
        
        MiHelper h =new MiHelper();
        
        try{
            h.validarcontraseña(contraseña, confcontraseña);
            System.out.println("Usuario registrado con exito\n Bienvenido(a) "+usuario);
           
        }catch(ExcepcionA e){
           // System.out.println("Error al registrar el usuario, : "+e.getMessage());
           e.printStackTrace();
        } 
    }
}
