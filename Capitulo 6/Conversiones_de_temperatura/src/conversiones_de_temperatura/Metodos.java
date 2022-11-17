/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversiones_de_temperatura;

/**
 *
 * @author Alicia Ulloa
 */

public class Metodos {
    
    public void Centigrados(int fahrenheit){
        double centigrados = 0.0;
        centigrados = 5.0/9.0 * (fahrenheit - 32);
        System.out.print("La conversion es: "+ centigrados +"\n");
    }
    
    public void Fahrenheit(int centigrados){
        double fahrenheit = 0.0;
        fahrenheit = 9.0/5.0 * centigrados + 32;
        System.out.print("La conversion es: "+ fahrenheit +"\n");
    }
}
