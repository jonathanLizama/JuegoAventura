/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpga;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class TestPGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        LINK DE GitHub:
        https://github.com/ManuelEV/testPGA.git
        */
        
      Scanner leer = new Scanner(System.in);
        int cursos;
           
        
        System.out.println("Ingrese la cantidad de cursos: ");
        cursos=leer.nextInt();
        
        MaquinaPGA myMachine[] = new MaquinaPGA[cursos];
        
        double notas=0;
        int horasSemana=0;
        double totalHoras=0;
        
        for(int i=0;i<cursos;i++){ 
            System.out.println("Ingrese Promedio de la asignatura "+(i+1)+" (entre 1.0 y 7.0):");
            do{
            notas=leer.nextDouble();
            }while(notas<1 || notas>7);
            System.out.println("Ingrese Horas de la asignatura "+(i+1)+":");
            do{
            horasSemana=leer.nextInt();
            }while(horasSemana==0);
            totalHoras=totalHoras+horasSemana; //Esto es para ir sacando el total de horas
            
            myMachine[i]=new MaquinaPGA(notas, horasSemana);
            
        }
        double peso[]=new double[cursos];
        for(int i=0;i<cursos;i++){ //FOR para calcular el PESO de cada asignatura
            peso[i]=(myMachine[i].getHoras())/totalHoras;
        }
        
        double pga=0;
        for(int i=0; i<cursos;i++){ //FOR para calcular PGA, con clase Calculadora
            Calculadora c1 = new Calculadora(peso[i],myMachine[i].getNotas());
            pga=pga+c1.Multiplicar();
        }
        
        System.out.println("El PGA del alumno es: "+pga);
        
        
        
        
        
    }
    
}
