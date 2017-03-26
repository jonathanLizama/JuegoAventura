/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpga;

/**
 *
 * @author Manuel
 */
public class Calculadora {
    private double num1;
    private double num2;
    
    
    public Calculadora( double n1, double n2){
        
        num1=n1;
        num2=n2;
        
        
    }
    
    public double Sumar(){
        return num1+num2;
    }
            
    public double Restar(){
        return num1-num2;
    }
    
    public double Dividir(){
                  
        return num1/num2;
    
    }
    
    public double Multiplicar(){
        return num1*num2;
    }

}
