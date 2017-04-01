
package aventura;


public class Personaje {
    
    private int health;
    private String spells="";
    
    public Personaje(){
        
    }
    
    
    public int mostrarEstadoSalud(boolean drag,boolean cerveza){ 
        Castillo cast = new Castillo();
        Bar trago = new Bar();
        
        cast.setAtaqueDrag(drag);
        trago.setTomarCerveza(cerveza);
             
        health=100-cast.getAtaqueDrag()+trago.tomarCerveza();
        
            return health;  
    }
    
    
    public String mostrarEstadoHechizos(boolean power){
        ZonaMagica poder = new ZonaMagica();
        
        poder.setAtaqueDrag(power);
        
        spells=poder.bolaFuego();
        
            return spells;
    }
    
    
    public int caminar(){
        int numRandom=(int) (Math.random()*3+1);
        return numRandom;
    }
    
    
    
}
