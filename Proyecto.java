/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.java;

/**
 *
 * @author jvald
 */
public class Proyecto {
    public static void main (String[]args){
        
        CalculadoraJava calcu = new CalculadoraJava (10,2);
       
        double suma = calcu.sumar();
        System.out.println ("la suma es :" + suma);
        
         double resta = calcu.restar();
        System.out.println ("la resta es :" + resta );
        
        
        double multiplicacion = calcu.multiplicar ();
        System.out.println ("la suma es :" + multiplicacion);
        
        double division = calcu.dividir();
        System.out.println ("la suma es :" + division);
    }
    
}
