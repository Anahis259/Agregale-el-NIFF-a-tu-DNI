/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NiffServicio;

import java.util.Scanner;
import niff.entidades.NiffApp;

/**
 *
 * @author anahi
 */
public class ServicioDNI {
    public static long CrearNiff(NiffApp Obj){
        Scanner leer = new Scanner(System.in);
        do{
        System.out.println("Ingrese su DNI el cual seria su Nro. de documento no mayor a 8 digitos");
        Obj.setDNI(leer.nextLong());
        if(Integer.toString((int) Obj.getDNI()).length()== 8){
        }else{
            System.out.println("La cantidad de digitos ingresado es INCORRECTA......");
        }
        }while(Integer.toString((int) Obj.getDNI()).length()!= 8);
        return Obj.getDNI();

    }
    public static NiffApp CalcularLetra(NiffApp Obj){
        double resto = Math.floor(Obj.getDNI()%23);
        System.out.println("El resto de la division es: "+resto);
        if (resto >= 0 || resto <=22){
            Obj.setLetra(new String[23]);
            //String [] letra = new String[23]; 
            Obj.getLetra()[0] = "t".toUpperCase();
            Obj.getLetra()[1] = "r".toUpperCase();
            Obj.getLetra()[2] = "w".toUpperCase();
            Obj.getLetra()[3] = "a".toUpperCase();
            Obj.getLetra()[4] = "g".toUpperCase();        
            Obj.getLetra()[5] = "m".toUpperCase();
            Obj.getLetra()[6] = "y".toUpperCase(); 
            Obj.getLetra()[7] = "f".toUpperCase();
            Obj.getLetra()[8] = "p".toUpperCase(); 
            Obj.getLetra()[9] = "d".toUpperCase();        
            Obj.getLetra()[10] = "x".toUpperCase();
            Obj.getLetra()[11] = "b".toUpperCase();
            Obj.getLetra()[12] = "n".toUpperCase();
            Obj.getLetra()[13] = "j".toUpperCase();    
            Obj.getLetra()[14] = "z".toUpperCase();
            Obj.getLetra()[15] = "s".toUpperCase();
            Obj.getLetra()[16] = "q".toUpperCase();
            Obj.getLetra()[17] = "v".toUpperCase();
            Obj.getLetra()[18] = "h".toUpperCase();       
            Obj.getLetra()[19] = "l".toUpperCase();
            Obj.getLetra()[20] = "c".toUpperCase(); 
            Obj.getLetra()[21] = "k".toUpperCase();
            Obj.getLetra()[22] = "e".toUpperCase();      
            System.out.println("Lista de letras con sus respectivos indices: ");
            for(int i = 0; i < Obj.getLetra().length-1 ; i++){
            
                System.out.println(""+Obj.getLetra()[i]+" indice "+i);
                if (resto == i){
                    System.out.println("DNI+NIFF: "+Obj.getDNI()+"-"+Obj.getLetra()[i]);
                    
                }
                
            }
        
        }else{
            System.out.println("Al resultado no obtenido no se le puede asignar un NIFF");
        }
        return Obj;
    }
}
