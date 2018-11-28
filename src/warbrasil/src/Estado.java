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
public class Estado {
    
    private ArrayList<Estado> vizinhos;
    private Exercito exercito;
    private String name;
    private String regiao;
    
    public Estado(String name, String regiao) {
        this.name = name;
        this.regiao = regiao;
    }
    
}
