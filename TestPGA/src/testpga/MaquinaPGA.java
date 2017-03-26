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
public class MaquinaPGA {
    
    private double notas;
    private int horasSemana;
    
    
    public MaquinaPGA(){ 
        
        notas=0;
        horasSemana=0;
    }
    public MaquinaPGA(double promedio, int horas){ 
        //courses=cursos;
        notas=promedio;
        horasSemana=horas;
    }
    public void setNotas(double n){
        notas=n;
    }
    
    public double getNotas(){
        return notas;
    }
    public void setHoras(int horas){
        horasSemana=horas;
    }
    public int getHoras(){
        return horasSemana;
    }
    
}
