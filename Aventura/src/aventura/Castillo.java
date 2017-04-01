package aventura;


public class Castillo {
    
    private int drake=0; 
    
    public Castillo(){
        
    }
    
   
    public void setAtaqueDrag(boolean op){
        if(op==false){
           drake=0; 
        }
        if(op==true){
        drake=70;
        }
    }
    
    public int getAtaqueDrag(){ //El dragon ataca al personaje 
        return drake;
    }
    
    
}
