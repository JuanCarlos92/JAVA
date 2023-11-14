
package potencia;

/**
 *
 * @author Juan Carlos
 */
public class calcularPotencia {

    
    public static void main(String[] args) {
        int base= 5;
        int exponente = 2;
        int resultado;
        
        //Si exponente = 0. resultado vale 1 y muestra por pantalla resultado
        if (exponente==0){
            resultado = 1;
            System.out.println("Al ser el exponente 0 el resultado sera: " + resultado);
        }
        //Si base = 1. resultado vale 1 y muestra por pantalla resultado
        if (base==1){
            resultado = 1;
            System.out.println("Al ser la base 1 el resultado sera: " + resultado);
        }
        
        //Si base >1 y exponente >0. calcula la potencia y almacena en resultado
        if (base>1 && exponente>0){
            resultado = 1;
            for (int i = 1; i <= exponente; i++) {
                resultado = resultado * base;
            }
            System.out.println("El resultado es: " + resultado);
            }
        }
    }
    
 

    
    

