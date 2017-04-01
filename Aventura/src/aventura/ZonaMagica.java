
 
package aventura;

public class ZonaMagica {
    private String fireball;
    
    public ZonaMagica(){
        
    }
    
    public String bolaFuego(){
        return fireball;
    }
    
    public void setAtaqueDrag(boolean op){
        if(op==false){
           fireball=""; 
        }
        if(op==true){
        fireball="Bola de fuego";
        }
    }
    
}
