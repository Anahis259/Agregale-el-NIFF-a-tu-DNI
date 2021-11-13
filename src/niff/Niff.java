/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niff;

import NiffServicio.ServicioDNI;
import niff.entidades.NiffApp;

/**
 *
 * @author anahi
 */
public class Niff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NiffApp Obj = new NiffApp(); 
        ServicioDNI.CrearNiff(Obj);
        ServicioDNI.CalcularLetra(Obj);
    }
    
}
