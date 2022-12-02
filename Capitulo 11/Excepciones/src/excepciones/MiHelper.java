/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Alicia Ulloa
 */
public class MiHelper {
    MiHelper(){   
    }
    
    public void validarcontraseña(String contraseña, String confcontraseña) throws ExcepcionA{
     
        if(contraseña.equals(confcontraseña)==false){
        
            throw new ExcepcionA("Las claves no coinciden.");
        }
        if(contraseña.length()<5){
            
            throw new ExcepcionA("Debe ingresar 5 caracteres como minimo");
        }

    }
}
