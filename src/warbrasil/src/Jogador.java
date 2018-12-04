/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbrasil.src;

/**
 *
 * @author kelvin
 */
public class Jogador {
    
    private String name;
    private String color;
    private int qtd_estados;
    private int qtd_carta_estado;
    
    public Jogador(String name, String color, int qtd_estados, int qtd_carta_estado) {
        this.name = name;
        this.color = color;
        this.qtd_estados = qtd_estados;
        this.qtd_carta_estado = qtd_carta_estado;
    }
    
    public void jogar() {
        
    }
    
    public void addQtdEstado(int qtd) {
        this.qtd_estados = this.qtd_estados + qtd;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getQtd_carta_estado() {
        return qtd_carta_estado;
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.color + "| qtdEstado: " + this.qtd_estados + "\n";
    }
    
}
