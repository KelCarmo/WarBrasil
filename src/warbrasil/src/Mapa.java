/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil.src;

import java.util.ArrayList;

/**
 *
 * @author kelvin
 */
public abstract class Mapa {
    private ArrayList<Estado> estados;
    
    
    public Mapa() {
        
    }
    
    abstract void montarMapa();
    
}
