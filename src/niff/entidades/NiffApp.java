/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niff.entidades;



/**
 *
 * @author anahi
 */
public class NiffApp {
    private long DNI;
    private String[] Letra; 
    public NiffApp(){
        
    }

    public NiffApp(long DNI, String[] Letra) {
        this.DNI = DNI;
        this.Letra = Letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String[] getLetra() {
        return Letra;
    }

    public void setLetra(String[] Letra) {
        this.Letra = Letra;
    }
            
        
    }

