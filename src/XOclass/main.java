/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XOclass;

import static XOclass.XO.muestraContenido;
import java.util.Scanner;

/**
 *
 * @author Kevin Santos
 */
public class main {
    public static void main(String[] args) {
        XOclass.XO xo=new XOclass.XO();
        Scanner leer=new Scanner(System.in);
        int op;
        xo.asignarNombre();
        xo.asignarNombre();
        xo.asignarSimbolo();
        xo.asignarSimbolo();
        try{
         do{   
        System.out.println("\nx Y 0\nMenu" );
        System.out.println("1. Jugar\n2 .ver partidas\n3. Cambiar letra del Jugador\n4. Cambiar Nombre del jugador \n5. Salir");
        op=leer.nextInt();
        
        switch(op){
            case 1:
               xo.autoLlenado();
                
               xo.imprimirTablero();
               xo.jugar();
                break;
            case 2:
                System.out.println("Lista de partidas: ");
                String m="ArchivoXO.txt";
                muestraContenido(m);
                break;
            case 3:
               xo.asignarSimbolo();
                break;
            case 4:
                xo.asignarNombre();
                break;
                
        }
         }while(op !=5);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
