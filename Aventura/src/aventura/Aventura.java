

package aventura;

import java.util.Scanner;


public class Aventura {

    public static void main(String[] args) {
        //GITHUB: https://github.com/ManuelEV/JuegoAventura.git
        Scanner leer=new Scanner(System.in);
        
        int contDrag=0,contCerveza=0,contBolaFuego=0;
        //Para saber cuando deterner el juego
        
        System.out.println("Salud inicial del Jugador: 100pts");
        System.out.println("El personaje inicialmente no posee hechizos");
        System.out.println("El personaje aparece en uno de los tres escenarios (al azar)");
        System.out.println("Lugar 1: Castillo");
        System.out.println("Lugar 2: Bar");
        System.out.println("Lugar 3: Zona magica");
        System.out.println("Si usted utiliza todos los objetos, termina el juego");
        System.out.println("Empecemos:");
        
        System.out.println("********************************");
        
        
        int guardarCaminar=0;
        
        boolean cambiarDrag=false;
        boolean cambiarBeer=false;
        boolean cambiarSpell=false;
        
        Personaje p1 = new Personaje(); //Es la unica clase que se usa en Aventura
        
        do{//Ciclo del juego, si se usan todos los objetos, el juego termina
        guardarCaminar = p1.caminar();
        
        System.out.println("Usted esta en el lugar "+guardarCaminar);
        
        System.out.println("1.- Caminar");
        System.out.println("2.- Consultar estado");
        System.out.println("3.- Usar objeto");
         
        int opc=leer.nextInt();//para el swtich case
        
        int ingreseNuevamente;
        do{//validacion
            ingreseNuevamente=0; // por defecto se salta el ciclo
        switch(opc){
            case 1: 
                //esto hace que continue
                break;
            case 2:
                //consultar estado de Salud y de Hechizos
                //Si el objeto ya fue usado, "cambiar" se vuelve falso
                if(contDrag==1){
                cambiarDrag=false;
                }
                if(contCerveza==1){
                cambiarDrag=false;
                }
                if(contBolaFuego==1){
                cambiarDrag=false;
                }
                System.out.println("El estado de salud es: "+p1.mostrarEstadoSalud(cambiarDrag, cambiarBeer));
                System.out.println("Hechizos aprendidos: "+p1.mostrarEstadoHechizos(cambiarSpell));
                break;
            case 3:
                //usar objeto
                
                if(guardarCaminar==1){//castillo
                    cambiarDrag=true;
                    contDrag++;
                }   
                if(guardarCaminar==2){//bar
                    cambiarBeer=true;
                    contCerveza++;
                }
                if(guardarCaminar==3){//zona magica
                    cambiarSpell=true;
                    contBolaFuego++;
                }
                
                break;
            default:
                System.out.println("Error de ingreso, intente nuevamente");
                ingreseNuevamente++;
        }
            
        }while(ingreseNuevamente==1);
        
        
        }while(contDrag==0 || contCerveza==0 || contBolaFuego==0);
        
        System.out.println("Haz terminado el juego, Felicidades");
        
    }
    
}
