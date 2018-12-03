/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil;

import warbrasil.src.MapaClassico;

/**
 *
 * @author kelvin e Rejanio
 */
public class WarBrasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MapaClassico novo = MapaClassico.getInstance();
        novo.sortExercitos(2);  
        
        
        System.out.println(novo);
    }
    
}
