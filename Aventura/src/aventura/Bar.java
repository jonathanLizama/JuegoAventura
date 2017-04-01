
package aventura;


public class Bar {
    private int beer=10; //recupera 10pts de salud
    
    
    public Bar(){
        
    }
    
    public void setTomarCerveza(boolean op){
        if(op==false){
           beer=0; 
        }
        if(op==true){
        beer=10;
        }
    }
    
    public int tomarCerveza(){//+10 pts de salud al personaje
        return beer;
    }
    
}
