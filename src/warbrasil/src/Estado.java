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
        this.vizinhos = new ArrayList<>();
        this.name = name;
        this.regiao = regiao;
    }
    
    public boolean addVizinho(Estado vizinho) {
        return this.vizinhos.add(vizinho);
    }
    
    public void setExercito(Exercito e) {
        this.exercito = e;
    }
    
    public Exercito getExercito() {
        return this.exercito;
    }
    
    
    @Override
    public String toString() {
        return this.name + "(" + this.exercito + ")" + ", ";
    }

    public ArrayList<Estado> getVizinhos() {
        return vizinhos;
    }
    
     public Estado getVizinho(String name) {
        for(Estado vizinho: this.vizinhos) {
            if(name.equals(vizinho.getName())) return vizinho;
        }
        return null;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    
}
