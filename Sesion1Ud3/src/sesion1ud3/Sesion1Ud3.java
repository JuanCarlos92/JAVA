/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion1ud3;

/**
 *
 * @author Juan Carlos
 */
public class Sesion1Ud3 {
    //La presente práctica tiene como objetivo familiarizar al alumno con el mundo con las
    //estructuras condicionales. Para ello, vamos a resolver lo siguientes ejercicios cortos: 
    
    public static void main(String[] args) {
        Operaciones PositvoNeg = new Operaciones(-1);
        Operaciones PositvoNeg0 = new Operaciones(0);
        Operaciones PosParImpar = new Operaciones(3);
        Operaciones Intervalo = new Operaciones(50);
        Operaciones SumResMulDiv = new Operaciones(4, 4, 3);
        PositvoNeg.PositivoNegativo();
        PositvoNeg0.PositivoNegativoCero();
        PosParImpar.PositivoParImpar();
        Intervalo.Intervalos();
        SumResMulDiv.menu();
        
        

    }

}
